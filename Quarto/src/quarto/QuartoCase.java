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
public class QuartoCase {
    
    private QuartoPiece piece;
    
    public QuartoCase(){
        piece = null;
    }
    
    public QuartoPiece getPiece(){
        return this.piece;
    }
    
    public void setPiece(QuartoPiece piece){
        this.piece = piece;
    }
    
    public String affichePiece(){
        if(this.piece == null){
            return "    ";
        }else{
            return this.piece.affichePiece();

        }
    }
    
}
