/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import quarto.Case;
import quarto.Piece;
import quarto.Plateau;

/**
 *
 * @author pauli
 */
public interface IGui {
    public void affichePiece(Piece piece);
    public void afficheCase(Case the_case);
    public void affichePlateau(Plateau plateau);
}
