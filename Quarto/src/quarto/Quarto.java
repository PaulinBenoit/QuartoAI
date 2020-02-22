package quarto;

import java.util.Scanner;

//moteur de jeu
import gui.TextGui;

public class Quarto {

    public static void main(String[] args) {
        QuartoPiece[] pieces = new QuartoPiece[16];
        pieces[0] = new QuartoPiece(Carac.Petit, Carac.Clair, Carac.Carré, Carac.Plein);
        pieces[1] = new QuartoPiece(Carac.Grand, Carac.Clair, Carac.Carré, Carac.Plein);
        pieces[2] = new QuartoPiece(Carac.Petit, Carac.Sombre, Carac.Carré, Carac.Plein);
        pieces[3] = new QuartoPiece(Carac.Grand, Carac.Sombre, Carac.Carré, Carac.Plein);
        pieces[4] = new QuartoPiece(Carac.Petit, Carac.Clair, Carac.Rond, Carac.Plein);
        pieces[5] = new QuartoPiece(Carac.Grand, Carac.Clair, Carac.Rond, Carac.Plein);
        pieces[6] = new QuartoPiece(Carac.Petit, Carac.Sombre, Carac.Rond, Carac.Plein);
        pieces[7] = new QuartoPiece(Carac.Grand, Carac.Sombre, Carac.Rond, Carac.Plein);
        pieces[8] = new QuartoPiece(Carac.Petit, Carac.Clair, Carac.Carré, Carac.Creux);
        pieces[9] = new QuartoPiece(Carac.Grand, Carac.Clair, Carac.Carré, Carac.Creux);
        pieces[10] = new QuartoPiece(Carac.Petit, Carac.Sombre, Carac.Carré, Carac.Creux);
        pieces[11] = new QuartoPiece(Carac.Grand, Carac.Sombre, Carac.Carré, Carac.Creux);
        pieces[12] = new QuartoPiece(Carac.Petit, Carac.Clair, Carac.Rond, Carac.Creux);
        pieces[13] = new QuartoPiece(Carac.Grand, Carac.Clair, Carac.Rond, Carac.Creux);
        pieces[14] = new QuartoPiece(Carac.Petit, Carac.Sombre, Carac.Rond, Carac.Creux);
        pieces[15] = new QuartoPiece(Carac.Grand, Carac.Sombre, Carac.Rond, Carac.Creux);
        
        QuartoPiece[] piecesDispo = pieces;
        
        QuartoPlateau plateau = new QuartoPlateau();
        QuartoJoueur joueur1 = new QuartoJoueur();
        QuartoJoueur joueur2 = new QuartoJoueur();

        Scanner scan1 = new Scanner(System.in);
        int numPiece;
        int numCase;
        
        while(true){
            //choisir une piece parmis les disponibles (Joueur1)
            
            System.out.println("Choisir une piece parmis les disponible");
            for(int i = 0; i < piecesDispo.length; i++){
                System.out.println("Piece "+ i + " : " + piecesDispo[i].getTaille().toString() + " " + piecesDispo[i].getCouleur().toString() + " " + piecesDispo[i].getForme().toString() + " " + piecesDispo[i].getRemplissage().toString());
            }
            numPiece = scan1.nextInt();
            //choisir un emplacement du plateau vide (Joueur2)
            System.out.println("Choisir un emplacement du plateau : ");
            plateau.affichePlateau();
            numCase = scan1.nextInt();
            //poser la piece choisie sur l'emplacement du plateau choisi (Joueur2)
            plateau.setCase(numCase/4, numCase%4, piecesDispo[numPiece]);
            //vérifier la victoire
            //changement de joueur
        }
        
    }
            
}
