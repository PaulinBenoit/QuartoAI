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
public class Plateau {

    private Case[][] m_cases = new Case[4][4];
    private ArrayList<Case> m_cases_libres = new ArrayList<>();

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

    public ArrayList<Case> getCasesLibres() {
        return this.m_cases_libres;
    }

    public Case getCaseLibre(int x) {
        return this.m_cases_libres.get(x);
    }

    public void setCaseLibre(Case the_case, int x) {
        this.m_cases_libres.set(x, the_case);
    }

    public void majCasesLibres() {
        this.m_cases_libres = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (this.m_cases[i][j].getPiece() == null) {
                    m_cases_libres.add(m_cases[i][j]);
                }
            }
        }
    }

    public void posePiece(Case the_case, Piece piece) {
        this.m_cases[the_case.getPosX()][the_case.getPosY()].setPiece(piece);
        this.majCasesLibres();
    }

    public boolean isWin() {
        boolean result = false;
        Case[] ligne = new Case[4];

        //lignes vertical
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ligne[j] = m_cases[i][j];
            }
            result = result | checkLigne(ligne);
        }

        //lignes horizontal
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ligne[j] = m_cases[j][i];
            }
            result = result | checkLigne(ligne);
        }

        //diagonale 1
        for (int i = 0; i < 4; i++) {
            ligne[i] = m_cases[i][i];
            result = result | checkLigne(ligne);
        }

        //diagonale 2
        ligne[0] = m_cases[0][3];
        ligne[1] = m_cases[1][2];
        ligne[2] = m_cases[2][1];
        ligne[3] = m_cases[3][0];
        result = result | checkLigne(ligne);

        return result;
    }

    public boolean checkLigne(Case[] ligne) {
        //la ligne contient au moins une pièce vide
        if (ligne[0].getPiece() == null | ligne[1].getPiece() == null | ligne[2].getPiece() == null | ligne[3].getPiece() == null) {
            return false; 
        //couleur
        } else if (ligne[0].getPiece().getCouleur() == ligne[1].getPiece().getCouleur()
                & ligne[1].getPiece().getCouleur() == ligne[2].getPiece().getCouleur()
                & ligne[2].getPiece().getCouleur() == ligne[3].getPiece().getCouleur()) {
            return true;
            //forme
        } else if (ligne[0].getPiece().getForme() == ligne[1].getPiece().getForme()
                & ligne[1].getPiece().getForme() == ligne[2].getPiece().getForme()
                & ligne[2].getPiece().getForme() == ligne[3].getPiece().getForme()) {
            return true;
            //taille
        } else if (ligne[0].getPiece().getTaille() == ligne[1].getPiece().getTaille()
                & ligne[1].getPiece().getTaille() == ligne[2].getPiece().getTaille()
                & ligne[2].getPiece().getTaille() == ligne[3].getPiece().getTaille()) {
            return true;
            //remplissage
        } else if (ligne[0].getPiece().getRemplissage() == ligne[1].getPiece().getRemplissage()
                & ligne[1].getPiece().getRemplissage() == ligne[2].getPiece().getRemplissage()
                & ligne[2].getPiece().getRemplissage() == ligne[3].getPiece().getRemplissage()) {
            return true;
        } else {
            return false;
        }
    }
}
