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
public class QuartoPlateau {
    private QuartoCase[][] cases;
    
    public QuartoPlateau(){
        cases = new QuartoCase[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                cases[i][j] = new QuartoCase();
            }
        }
    }
    
    public QuartoCase[][] getCases(){
        return cases;
    }
    
    public QuartoCase getCase(int x, int y){
        return cases[x][y];
    }
    
    public void setCase(int x, int y, QuartoPiece piece){
        this.cases[x][y].setPiece(piece);
    }
    
    public void affichePlateau(){
        String ligne;
        System.out.println("---------------------");
        for(int i = 0; i < 4; i++){
            ligne = "|";
            for(int j = 0; j < 4; j++){
                ligne += cases[i][j].affichePiece();
                ligne += "|";
            }
            System.out.println(ligne);
            System.out.println("---------------------");
        }
    }
    
    public boolean isFini(){
        return false;
    }
}
