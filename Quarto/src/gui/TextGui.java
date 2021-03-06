/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java.util.Scanner;
import quarto.Case;
import quarto.Joueur;
import quarto.Piece;
import quarto.PieceConstante;
import quarto.Plateau;

/**
 *
 * @author pauli
 */
public class TextGui implements IGui {

    public TextGui() {

    }

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

        affichage = "------------------------";
        System.out.println(affichage);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                afficheCase(plateau.getCase(i, j));
            }
            System.out.println(); 
            System.out.println(affichage);
        }
    }

    @Override
    public Piece choixPiece(ArrayList<Piece> pieces) {
        int numPiece;
        Scanner scan = new Scanner(System.in);
        
        numPiece = scan.nextInt();
        return pieces.get(numPiece);
    }

    @Override
    public void affichePieces(ArrayList<Piece> pieces) {
        String affichage;

        for (int i = 0; i < pieces.size(); i++) {
            affichage = i + " : ";
            System.out.print(affichage);
            affichePiece(pieces.get(i));
            System.out.println();
        }
    }

    @Override
    public Case choixCase(ArrayList<Case> cases) {
        int numCase;
        Scanner scan = new Scanner(System.in);
        
        numCase = scan.nextInt();
        return cases.get(numCase);
    }

    @Override
    public void afficheJoueur(Joueur joueur) {
        String affichage;
        
        affichage = joueur.getNomJoueur();
        System.out.print(affichage);
    }

    @Override
    public void afficheTourJoueur(Joueur joueur) {
        String affichage;
        
        affichage = "Tour de : ";
        System.out.print(affichage);
        afficheJoueur(joueur);
        System.out.println();
    }

    @Override
    public void afficheCases(ArrayList<Case> cases) {
        String affichage;

        for (int i = 0; i < cases.size(); i++) {
            affichage = i + " : ";
            System.out.print(affichage);
            afficheCase(cases.get(i));
            System.out.println();
        }
    }

    @Override
    public void afficheVictoire(Joueur joueur) {
        String affichage;
        
        affichage = "Le joueur " + joueur.getNomJoueur() + " a remporté la partie !";
        System.out.println(affichage);
    }
}
