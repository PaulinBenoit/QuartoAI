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
        
        double[] input = new double[]{0.1,0.5,0.2,0.9};
        double[] target = new double[]{0,0,1,0,0};
        
        for(int i = 0; i < 1000000; i++){
            net.train(input, target, 0.3);
        }
        
        double[] output = net.calculate(input);
        System.out.println(Arrays.toString(output));
    }
}
