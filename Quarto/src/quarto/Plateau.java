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
public class Plateau {
    private Case[][] m_cases;
    
    public Plateau(){
        
    }
    
    public Plateau(Case[][] cases){
        this.m_cases = cases;
    }
    
    public Case[][] getCases(){
        return this.m_cases;
    }
    
    public Case getCase(int x, int y){
        return this.m_cases[x][y];
    }
    
    public void setCase(int x, int y, Piece piece){
        this.m_cases[x][y].setPiece(piece);
    }
}
