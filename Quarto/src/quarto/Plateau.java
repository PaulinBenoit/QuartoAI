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

    private Case[][] m_cases = new Case[4][4];
    private Case[] m_cases_libres = new Case[16];

    public Plateau() {

    }

    public Plateau(Case[][] cases) {
        this.m_cases = cases;
        majCasesLibres();
    }

    public Case[][] getCases() {
        return this.m_cases;
    }

    public Case getCase(int x, int y) {
        return this.m_cases[x][y];
    }

    public void setCase(Case the_case, int x, int y) {
        this.m_cases[x][y] = the_case;
    }

    public Case[] getCasesLibres() {
        return this.m_cases_libres;
    }

    public Case getCaseLibre(int x) {
        return this.m_cases_libres[x];
    }

    public void setCaseLibre(Case the_case, int x) {
        this.m_cases_libres[x] = the_case;
    }
    
    public void majCasesLibres(){
        this.m_cases_libres = new Case[16];
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (this.m_cases[i][j].getPiece() == null){
                    m_cases_libres[i*4+j] = m_cases[i][j];
                }
            }
        }
    }
    
    public void posePiece(Case the_case, Piece piece){
        this.m_cases[the_case.getPosX()][the_case.getPosY()].setPiece(piece);
        this.majCasesLibres();
    }
}
