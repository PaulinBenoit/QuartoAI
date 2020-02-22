/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import quarto.Case;
import quarto.Piece;
import quarto.PieceConstante;
import quarto.Plateau;

/**
 *
 * @author pauli
 */
public class TextGui implements IGui {

    @Override
    public void affichePiece(Piece piece) {
        String affichage;

        if (piece == null) {
            affichage = "    ";
        } else {
            if (piece.getTaille() == PieceConstante.GRAND) {
                affichage = "G";
            } else {
                affichage = "P";
            }
            if (piece.getCouleur() == PieceConstante.BLANC) {
                affichage += "B";
            } else {
                affichage += "N";
            }
            if (piece.getForme() == PieceConstante.ROND) {
                affichage += "R";
            } else {
                affichage += "C";
            }
            if (piece.getRemplissage() == PieceConstante.PLEIN) {
                affichage += "P";
            } else {
                affichage += "C";
            }
        }

        System.out.print(affichage);
    }

    @Override
    public void afficheCase(Case the_case) {
        String affichage;

        affichage = "|";
        System.out.print(affichage);
        affichePiece(the_case.getPiece());
        System.out.print(affichage);
    }

    @Override
    public void affichePlateau(Plateau plateau) {
        String affichage;
        
        affichage = "---------------------";
        System.out.println(affichage);
        
        for (int i = 0; i < 4; i++) {   
            for (int j = 0; j < 4; j++) {
                afficheCase(plateau.getCase(i, j));
            }
            System.out.println(affichage);
        }
        System.out.println(affichage);
    }

}
