/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarto;

import ai.GeneticClient;
import ai.NeuronNetwork;

/**
 *
 * @author pauli
 */
public class Joueur {
    public int m_code_joueur;
    public String m_nom_joueur;
    
    public Joueur(){
        
    }
    
    public Joueur(int code_joueur, String nom_joueur){
        this.m_code_joueur = code_joueur;
        this.m_nom_joueur = nom_joueur;
    }
    
    public int getCodeJoueur(){
        return this.m_code_joueur;
    }
    
    public String getNomJoueur(){
        return this.m_nom_joueur;
    }
    
    public void setCodeJoueur(int code_joueur){
        this.m_code_joueur = code_joueur;
    }
    
    public void setNomJoueur(String nom_joueur){
        this.m_nom_joueur = nom_joueur;
    }
}
