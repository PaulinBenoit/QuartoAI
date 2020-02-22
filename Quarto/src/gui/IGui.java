/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import quarto.Case;
import quarto.Joueur;
import quarto.Piece;
import quarto.Plateau;

/**
 *
 * @author pauli
 */
public interface IGui {
    public void affichePiece(Piece piece);
    public void affichePieces(Piece[] pieces);
    public void afficheCase(Case the_case);
    public void afficheCases(Case[] cases);
    public void affichePlateau(Plateau plateau);
    public void afficheJoueur(Joueur joueur);
    public void afficheTourJoueur(Joueur joueur);        
    
    public Piece choixPiece(Piece[] pieces);
    public Case choixCase(Case[] cases);
}
