package ai;

/**
 *
 * @author pauli
 */
public class NeuronNetwork {

    private double[][] output;
    private double[][][] weights;
    private double[][] bias;
    
    private double [][] error_output;
    private double [][] derivative_output;

    public final int[] NETWORK_LAYER_SIZES;
    public final int INPUT_SIZE;
    public final int OUTPUT_SIZE;
    public final int NETWORK_SIZE;

    public NeuronNetwork(int... network_layer_sizes){
        this.NETWORK_LAYER_SIZES = network_layer_sizes;
        this.NETWORK_SIZE = network_layer_sizes.length;
        this.INPUT_SIZE = network_layer_sizes[0];
        this.OUTPUT_SIZE = network_layer_sizes[NETWORK_SIZE-1];

        this.output = new double[NETWORK_SIZE][];
        this.weights = new double[NETWORK_SIZE][][];
        this.bias = new double[NETWORK_SIZE][];
        this.error_output = new double[NETWORK_SIZE][];
        this.derivative_output = new double[NETWORK_SIZE][];

        for(int i = 0; i < NETWORK_SIZE; i++){
            this.output[i] = new double[NETWORK_LAYER_SIZES[i]];
            this.error_output[i] = new double[NETWORK_LAYER_SIZES[i]];
            this.derivative_output[i] = new double[NETWORK_LAYER_SIZES[i]];
            this.bias[i] = NetworkTools.createRandomArray(NETWORK_LAYER_SIZES[i], 0.3, 0.7);
            
            if(i > 0){
                this.weights[i] = NetworkTools.createRandomArray(NETWORK_LAYER_SIZES[i], NETWORK_LAYER_SIZES[i-1], -0.3, 0.5);
            }
        }
    }
    
    public double[] calculate(double... input){
        if(input.length != this.INPUT_SIZE) return null;
        this.output[0] = input;
        
        for(int layer = 1; layer < NETWORK_SIZE; layer++){
            for(int neuron = 0; neuron < NETWORK_LAYER_SIZES[layer]; neuron++){
                
                double sum = bias[layer][neuron];
                for(int prev_neuron = 0; prev_neuron < NETWORK_LAYER_SIZES[layer-1]; prev_neuron++){
                    sum = sum + weights[layer][neuron][prev_neuron] * output[layer-1][prev_neuron];
                }
                
                output[layer][neuron] = sigmoid(sum);   
                derivative_output[layer][neuron] = output[layer][neuron] * (1 - output[layer][neuron]);
            }
        }
        return output[NETWORK_SIZE-1];
    }
    
    private double sigmoid(double x){
        return 1d / (1 + Math.exp(-x));
    }
    
    public void train(double[] input, double[] target, double eta){
        if(input.length != INPUT_SIZE || target.length != OUTPUT_SIZE) return;
        
        calculate(input);   
        backprop_error(target);
        update_weights_bias(eta);
    }
    
    public void train(TrainSet set, int loops, int batch_size){
        for(int i = 0; i < loops; i++){
            TrainSet batch = set.extractBatch(batch_size);
            for(int b = 0; b < batch.size(); b++){
                this.train(batch.getInput(b), batch.getOutput(b), 0.3);
            }
        }
    }
    
    public void backprop_error(double[] target){
        for(int neuron = 0; neuron < NETWORK_LAYER_SIZES[NETWORK_SIZE-1]; neuron++){
            error_output[NETWORK_SIZE-1][neuron] = (output[NETWORK_SIZE-1][neuron] - target[neuron])
                    * derivative_output[NETWORK_SIZE-1][neuron];            
        }
        
        for(int layer = NETWORK_SIZE-2; layer > 0; layer--){
            for(int neuron = 0; neuron < NETWORK_LAYER_SIZES[layer]; neuron++){
                double sum = 0;
                
                for(int next_neuron = 0; next_neuron < NETWORK_LAYER_SIZES[layer+1]; next_neuron++){
                    sum = sum + weights[layer+1][next_neuron][neuron] * error_output[layer+1][next_neuron];
                }
                error_output[layer][neuron] = sum * derivative_output[layer][neuron];
            }
        }
    }
    
    public void update_weights_bias(double eta){
        for(int layer = 1; layer < NETWORK_SIZE; layer++){
            for(int neuron = 0; neuron < NETWORK_LAYER_SIZES[layer]; neuron++){
                
                double delta_bias = - eta * error_output[layer][neuron];
                bias[layer][neuron] = bias[layer][neuron] + delta_bias;
                
                for(int previous_neuron = 0; previous_neuron < NETWORK_LAYER_SIZES[layer-1]; previous_neuron++){
                    weights[layer][neuron][previous_neuron] = weights[layer][neuron][previous_neuron] 
                            + delta_bias * output[layer-1][previous_neuron];
                }                
            }
        }
    }
}
