/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author pauli
 */
public class GeneticAlgorithm{
    
    public double MUTATION_RATE = 0.1;
    public double MUTATION_STRENGHT = 0.1;
    public double AMOUNT_SURVIVORS = 1;
    
    public <T extends GeneticClient> void evolve(ArrayList<T> clients){
        clients.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if(o1.getScore() > o2.getScore()) return -1;
                if(o1.getScore() < o2.getScore()) return 1;
                return 0;
            }
        });
        
        ArrayList<T> selection = this.selection(clients);
        
        crossover(clients, selection);
        
        clients.addAll(0, selection);
        
        mutate(clients);
    }

    private <T extends GeneticClient> ArrayList<T> selection(ArrayList<T> clients) {
        ArrayList<T> selection = new ArrayList<>();
        
        for(int i = 0; i < Math.min(AMOUNT_SURVIVORS, clients.size()); i++){
            selection.add(clients.get(i));
        }
        
        for(T o: selection){
            clients.remove(o);
        }
        return selection;
    }

    private <T extends GeneticClient> void crossover(ArrayList<T> newborns, ArrayList<T> survivors) {
        for(T newborn: newborns){
            T parentA = survivors.get((int)(Math.random() * survivors.size()));
            
            for(int i = 1; i < newborn.getNeuronNetwork().NETWORK_SIZE; i++){
                newborn.getNeuronNetwork().weights[i] = copyArray(parentA.getNeuronNetwork().weights[i]);
                newborn.getNeuronNetwork().bias[i] = copyArray(parentA.getNeuronNetwork().bias[i]);
            }
        }
    }
    
    private <T extends GeneticClient> void mutate(ArrayList<T> clients){
         for(T client: clients){
           
            for(int i = 1; i < client.getNeuronNetwork().NETWORK_SIZE; i++){
                mutateArray(client.getNeuronNetwork().weights[i], MUTATION_RATE, MUTATION_STRENGHT);
                mutateArray(client.getNeuronNetwork().bias[i], MUTATION_RATE, MUTATION_STRENGHT);
            }
        }
    }

    public static void mutateArray(double[][] vals, double rate, double strength){
        Random random = new Random();
        for(int i = 0; i < vals.length; i++){
            for(int n = 0; n < vals[0].length; n++){
                if(Math.random() < rate){
                    vals[i][n] += random.nextGaussian() * strength;
                    
                }
            }
        }
    }
    
    public static void mutateArray(double[] vals, double rate, double strength){
        Random random = new Random();
        for(int i = 0; i < vals.length; i++){
            if(Math.random() < rate){
                vals[i] += random.nextGaussian() * strength;
            }
        }
    }
    
    public static double[][] copyArray(double[][] vals) {
        double[][] out = new double[vals.length][vals[0].length];
        for (int i = 0; i < vals.length; i++) {
            for (int n = 0; n < vals[0].length; n++) {
                out[i][n] = vals[i][n];
            }
        }
        return out;
    }

    public static double[] copyArray(double[] vals) {
        double[] out = new double[vals.length];
        for (int i = 0; i < vals.length; i++) {
            out[i] = vals[i];
        }return out;
    }

}
