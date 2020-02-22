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
public class Piece {

    private int m_taille;
    private int m_couleur;
    private int m_forme;
    private int m_remplissage;

    public Piece() {

    }

    public Piece(int taille, int couleur, int forme, int remplissage) {
        this.m_taille = taille;
        this.m_couleur = couleur;
        this.m_forme = forme;
        this.m_remplissage = remplissage;
    }

    public int getTaille() {
        return this.m_taille;
    }

    public int getCouleur() {
        return this.m_couleur;
    }

    public int getForme() {
        return this.m_forme;
    }

    public int getRemplissage() {
        return this.m_remplissage;
    }
}
