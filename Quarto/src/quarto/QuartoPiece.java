/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarto;

import quarto.Carac;

/**
 *
 * @author pauli
 */
public class QuartoPiece {
    private Carac taille;
    private Carac couleur;
    private Carac forme;
    private Carac remplissage;
    
    public QuartoPiece(){
        
    }
    
    public QuartoPiece(Carac taille, Carac couleur, Carac forme, Carac remplissage){
        this.taille = taille;
        this.couleur = couleur;
        this.forme = forme;
        this.remplissage = remplissage;
    }
    
    public Carac getTaille(){
        return this.taille;
    }
    
    public Carac getCouleur(){
        return this.couleur;
    }
    
    public Carac getForme(){
        return this.forme;
    }
    
    public Carac getRemplissage(){
        return this.remplissage;
    }
    
    public String affichePiece(){
        String affichage;
        if(this.taille == Carac.Grand){
            affichage = "G";
        }else{
            affichage = "P";
        }
        if(this.couleur == Carac.Sombre){
            affichage += "S";
        }else{
            affichage += "C";
        }
        if(this.forme == Carac.Rond){
            affichage += "R";
        }else{
            affichage += "C";
        }
        if(this.remplissage == Carac.Plein){
            affichage += "P";
        }else{
            affichage += "C";
        }
        return affichage;
    }
}
