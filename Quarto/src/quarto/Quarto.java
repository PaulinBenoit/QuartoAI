package quarto;

import java.util.Scanner;

//moteur de jeu
import gui.TextGui;
import java.util.ArrayList;

public class Quarto {

    public static void main(String[] args) {
        ArrayList<Piece> piecesDispo = InitGame.initPieces();
        Case[][] casesPlateau = InitGame.initCases();
        TextGui gui = new TextGui();
        
        Plateau plateau = new Plateau(casesPlateau);
        Joueur joueur1 = new Joueur(1, "Joueur 1");
        Joueur joueur2 = new Joueur(2, "Joueur 2");
        Piece pieceChoisie = new Piece();
        Case caseChoisie = new Case();

        boolean jeu_en_cours = true;
        
        while(jeu_en_cours){
            //J1 choisit une pièce P1 parmis les disponibles
            gui.afficheTourJoueur(joueur1);
            gui.affichePieces(piecesDispo);
            pieceChoisie = gui.choixPiece(piecesDispo);
            piecesDispo.remove(pieceChoisie);
            
            //J2 choisit une case libre C1
            gui.afficheTourJoueur(joueur2);
            gui.affichePlateau(plateau);
            gui.afficheCases(plateau.getCasesLibres());
            caseChoisie = gui.choixCase(plateau.getCasesLibres());
            
            //J2 pose la pièce P1 sur la case libre C1
            plateau.posePiece(caseChoisie, pieceChoisie);
            gui.affichePlateau(plateau);
            
            //vérification victoire de J2
            if(plateau.isWin()){
                jeu_en_cours = false;
                gui.afficheVictoire(joueur2);
            }
            
            //J2 choisit une pièce P2 parmis les disponibles
            gui.afficheTourJoueur(joueur2);
            gui.affichePieces(piecesDispo);
            pieceChoisie = gui.choixPiece(piecesDispo);
            piecesDispo.remove(pieceChoisie);
            
            //J1 choisit une case libre C2
            gui.afficheTourJoueur(joueur1);
            gui.affichePlateau(plateau);
            gui.afficheCases(plateau.getCasesLibres());
            caseChoisie = gui.choixCase(plateau.getCasesLibres());
            
            //J1 pose la pièce P2 sur la case libre C2
            plateau.posePiece(caseChoisie, pieceChoisie);
            gui.affichePlateau(plateau);
            
            //vérification victoire de J1
            if(plateau.isWin()){
                jeu_en_cours = false;
                gui.afficheVictoire(joueur1);
            }
        }
        
    }
            
}
