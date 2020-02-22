/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quarto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import quarto.Panneau;

/**
 *
 * @author pauli
 */
public class Fenetre extends JFrame{
    
    public Fenetre(){
        this.setTitle("Quarto");
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        Panneau pan = new Panneau();
        this.setContentPane(pan);
        this.setVisible(true);           
    }
}
