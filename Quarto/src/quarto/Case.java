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
public class Case {
    
    private Piece m_piece;
    
    public Case(){
        this.m_piece = null;
    }
    
    public Case(Piece piece){
        this.m_piece = piece;
    }
    
    public Piece getPiece(){
        return this.m_piece;
    }
    
    public void setPiece(Piece piece){
        this.m_piece = piece;
    }
    
}
