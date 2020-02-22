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
    private int m_pos_x;
    private int m_pos_y;
    
    public Case(){
        this.m_piece = null;
    }
    
    public Case(int pos_x, int pos_y){
        this.m_pos_x = pos_x;
        this.m_pos_y = pos_y;
        this.m_piece = null;
    }
    
    public Case(int pos_x, int pos_y, Piece piece){
        this.m_pos_x = pos_x;
        this.m_pos_y = pos_y;
        this.m_piece = piece;
    }
    
    public int getPosX(){
        return this.m_pos_x;
    }
    
    public void setPosX(int pos_x){
        this.m_pos_x = pos_x;
    }
    
    public int getPosY(){
        return this.m_pos_y;
    }
    
    public void setPosY(int pos_y){
        this.m_pos_y = pos_y;
    }
    
    public Piece getPiece(){
        return this.m_piece;
    }
    
    public void setPiece(Piece piece){
        this.m_piece = piece;
    }
    
}
