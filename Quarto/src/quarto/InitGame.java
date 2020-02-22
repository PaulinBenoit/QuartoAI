/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarto;

/**
 *
 * @author pauli
 */
public class InitGame {
    
    public static Piece[] initPieces(){
        Piece[] pieces = new Piece[16];
        pieces[0] = new Piece(PieceConstante.PETIT, PieceConstante.BLANC, PieceConstante.CARRE, PieceConstante.PLEIN);
        pieces[1] = new Piece(PieceConstante.GRAND, PieceConstante.BLANC, PieceConstante.CARRE, PieceConstante.PLEIN);
        pieces[2] = new Piece(PieceConstante.PETIT, PieceConstante.NOIR, PieceConstante.CARRE, PieceConstante.PLEIN);
        pieces[3] = new Piece(PieceConstante.GRAND, PieceConstante.NOIR, PieceConstante.CARRE, PieceConstante.PLEIN);
        pieces[4] = new Piece(PieceConstante.PETIT, PieceConstante.BLANC, PieceConstante.ROND, PieceConstante.PLEIN);
        pieces[5] = new Piece(PieceConstante.GRAND, PieceConstante.BLANC, PieceConstante.ROND, PieceConstante.PLEIN);
        pieces[6] = new Piece(PieceConstante.PETIT, PieceConstante.NOIR, PieceConstante.ROND, PieceConstante.PLEIN);
        pieces[7] = new Piece(PieceConstante.GRAND, PieceConstante.NOIR, PieceConstante.ROND, PieceConstante.PLEIN);
        pieces[8] = new Piece(PieceConstante.PETIT, PieceConstante.BLANC, PieceConstante.CARRE, PieceConstante.CREUX);
        pieces[9] = new Piece(PieceConstante.GRAND, PieceConstante.BLANC, PieceConstante.CARRE, PieceConstante.CREUX);
        pieces[10] = new Piece(PieceConstante.PETIT, PieceConstante.NOIR, PieceConstante.CARRE, PieceConstante.CREUX);
        pieces[11] = new Piece(PieceConstante.GRAND, PieceConstante.NOIR, PieceConstante.CARRE, PieceConstante.CREUX);
        pieces[12] = new Piece(PieceConstante.PETIT, PieceConstante.BLANC, PieceConstante.ROND, PieceConstante.CREUX);
        pieces[13] = new Piece(PieceConstante.GRAND, PieceConstante.BLANC, PieceConstante.ROND, PieceConstante.CREUX);
        pieces[14] = new Piece(PieceConstante.PETIT, PieceConstante.NOIR, PieceConstante.ROND, PieceConstante.CREUX);
        pieces[15] = new Piece(PieceConstante.GRAND, PieceConstante.NOIR, PieceConstante.ROND, PieceConstante.CREUX);
        
        return pieces;
    }
    
    public static Case[][] initCases(){
        Case[][] cases = new Case[4][4];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                cases[i][j] = new Case(i, j);
            }
        }
        
        return cases;
    }
}
