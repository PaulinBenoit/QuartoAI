/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarto;

import ai.GeneticClient;
import ai.NeuronNetwork;
import java.util.ArrayList;

/**
 *
 * @author pauli
 */
public class JoueurRobot extends Joueur implements GeneticClient{

    private NeuronNetwork m_network;
     
    public JoueurRobot(int code_joueur, String nom_joueur, NeuronNetwork network){
        super(code_joueur, nom_joueur);
        this.m_network = network;
    }
    
    public int getProchaineCase(Plateau plateau, ArrayList<Piece> pieces_dispo){
        
    }

    @Override
    public NeuronNetwork getNeuronNetwork() {
        return this.m_network;
    }

    @Override
    public double getScore() {
        
        return 0d;
    }
}
