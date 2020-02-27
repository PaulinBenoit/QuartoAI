/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.util.Arrays;

/**
 *
 * @author pauli
 */
public class testAI {
    public static void main(String[] args){
        System.out.println("hey");
        
        NeuronNetwork net = new NeuronNetwork(4,2,3,5);
        
        TrainSet set = new TrainSet(4,5);
        set.addData(new double[]{0.1,0.2,0.3,0.4}, new double[]{0,0,1,0,0});
        set.addData(new double[]{0.4,0.6,0.8,0.3}, new double[]{0,1,1,1,0});
        set.addData(new double[]{0.7,0.4,0.2,0.9}, new double[]{0,1,0,1,0});
        set.addData(new double[]{0.4,0.3,0.2,0.1}, new double[]{1,0,0,0,1});
        
        net.train(set, 100000, 4);
        
        for(int i = 0; i < 4; i++){
            System.out.println(Arrays.toString(net.calculate(set.getInput(i))));
        }
    }
}
