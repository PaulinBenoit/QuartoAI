/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarto;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author pauli
 */
public class PieceUI extends JPanel{
    
//    @Override
//    public void paintComponent(Graphics g){
//        //PIECES
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                g.drawRect(i * TAILLE_CASE + MARGIN_PLATEAU, j * TAILLE_CASE + MARGIN_PLATEAU, TAILLE_CASE, TAILLE_CASE);
//            }
//        }
//        Image[] images = new Image[16];
//        try {
//            images[0] = ImageIO.read(new File("image/Carre-Sombre-Plein.png"));
//            images[1] = ImageIO.read(new File("image/Carre-Sombre-Creux.png"));
//            images[2] = ImageIO.read(new File("image/Carre-Clair-Plein.png"));
//            images[3] = ImageIO.read(new File("image/Carre-Clair-Creux.png"));
//            images[4] = ImageIO.read(new File("image/Rond-Sombre-Plein.png"));
//            images[5] = ImageIO.read(new File("image/Rond-Sombre-Creux.png"));
//            images[6] = ImageIO.read(new File("image/Rond-Clair-Plein.png"));
//            images[7] = ImageIO.read(new File("image/Rond-Clair-Creux.png"));
//            images[8] = ImageIO.read(new File("image/Carre-Sombre-Plein.png"));
//            images[9] = ImageIO.read(new File("image/Carre-Sombre-Creux.png"));
//            images[10] = ImageIO.read(new File("image/Carre-Clair-Plein.png"));
//            images[11] = ImageIO.read(new File("image/Carre-Clair-Creux.png"));
//            images[12] = ImageIO.read(new File("image/Rond-Sombre-Plein.png"));
//            images[13] = ImageIO.read(new File("image/Rond-Sombre-Creux.png"));
//            images[14] = ImageIO.read(new File("image/Rond-Clair-Plein.png"));
//            images[15] = ImageIO.read(new File("image/Rond-Clair-Creux.png"));
//        } catch (IOException ex) {
//            Logger.getLogger(Panneau.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        PieceButton piece0 = new PieceButton(images[0]);
//        PieceButton piece1 = new PieceButton(images[1]);
//        PieceButton piece2 = new PieceButton(images[2]);
//        PieceButton piece3 = new PieceButton(images[3]);
//        PieceButton piece4 = new PieceButton(images[4]);
//        PieceButton piece5 = new PieceButton(images[5]);
//        PieceButton piece6 = new PieceButton(images[6]);
//        PieceButton piece7 = new PieceButton(images[7]);
//        PieceButton piece8 = new PieceButton(images[8]);
//        PieceButton piece9 = new PieceButton(images[9]);
//        PieceButton piece10 = new PieceButton(images[10]);
//        PieceButton piece11 = new PieceButton(images[11]);
//        PieceButton piece12 = new PieceButton(images[12]);
//        PieceButton piece13 = new PieceButton(images[13]);
//        PieceButton piece14 = new PieceButton(images[14]);
//        PieceButton piece15 = new PieceButton(images[15]);
//        int marginTotalX = MARGIN_PLATEAU + (TAILLE_CASE * 4) + MARGIN_PIECE;
//        int marginPetitePiece = (TAILLE_GRANDE_PIECE - TAILLE_PETITE_PIECE)/2;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                g.drawRect(i * TAILLE_GRANDE_PIECE + marginTotalX, j * TAILLE_GRANDE_PIECE + MARGIN_PIECE, TAILLE_GRANDE_PIECE, TAILLE_GRANDE_PIECE);
//            }
//        }
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 4; j++) {
//                g.drawImage(images[i * 4 + j], i * TAILLE_GRANDE_PIECE + marginTotalX, j * TAILLE_GRANDE_PIECE + MARGIN_PIECE, TAILLE_GRANDE_PIECE, TAILLE_GRANDE_PIECE, this);
//            }
//        }
//        for (int i = 2; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                g.drawImage(images[i * 4 + j], i * TAILLE_GRANDE_PIECE + marginTotalX + marginPetitePiece, j * TAILLE_GRANDE_PIECE + MARGIN_PIECE + marginPetitePiece, TAILLE_PETITE_PIECE, TAILLE_PETITE_PIECE, this);
//            }
//        }
//    }
}
