/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarto;

import java.util.ArrayList;

/**
 *
 * @author pauli
 */
public class InitGame {
    
    public static ArrayList<Piece> initPieces(){
        ArrayList<Piece> pieces = new ArrayList<>();
        pieces.add(new Piece(PieceConstante.PETIT, PieceConstante.BLANC, PieceConstante.CARRE, PieceConstante.PLEIN));
        pieces.add(new Piece(PieceConstante.GRAND, PieceConstante.BLANC, PieceConstante.CARRE, PieceConstante.PLEIN));
        pieces.add(new Piece(PieceConstante.PETIT, PieceConstante.NOIR, PieceConstante.CARRE, PieceConstante.PLEIN));
        pieces.add(new Piece(PieceConstante.GRAND, PieceConstante.NOIR, PieceConstante.CARRE, PieceConstante.PLEIN));
        pieces.add(new Piece(PieceConstante.PETIT, PieceConstante.BLANC, PieceConstante.ROND, PieceConstante.PLEIN));
        pieces.add(new Piece(PieceConstante.GRAND, PieceConstante.BLANC, PieceConstante.ROND, PieceConstante.PLEIN));
        pieces.add(new Piece(PieceConstante.PETIT, PieceConstante.NOIR, PieceConstante.ROND, PieceConstante.PLEIN));
        pieces.add(new Piece(PieceConstante.GRAND, PieceConstante.NOIR, PieceConstante.ROND, PieceConstante.PLEIN));
        pieces.add(new Piece(PieceConstante.PETIT, PieceConstante.BLANC, PieceConstante.CARRE, PieceConstante.CREUX));
        pieces.add(new Piece(PieceConstante.GRAND, PieceConstante.BLANC, PieceConstante.CARRE, PieceConstante.CREUX));
        pieces.add(new Piece(PieceConstante.PETIT, PieceConstante.NOIR, PieceConstante.CARRE, PieceConstante.CREUX));
        pieces.add(new Piece(PieceConstante.GRAND, PieceConstante.NOIR, PieceConstante.CARRE, PieceConstante.CREUX));
        pieces.add(new Piece(PieceConstante.PETIT, PieceConstante.BLANC, PieceConstante.ROND, PieceConstante.CREUX));
        pieces.add(new Piece(PieceConstante.GRAND, PieceConstante.BLANC, PieceConstante.ROND, PieceConstante.CREUX));
        pieces.add(new Piece(PieceConstante.PETIT, PieceConstante.NOIR, PieceConstante.ROND, PieceConstante.CREUX));
        pieces.add(new Piece(PieceConstante.GRAND, PieceConstante.NOIR, PieceConstante.ROND, PieceConstante.CREUX));
        
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
