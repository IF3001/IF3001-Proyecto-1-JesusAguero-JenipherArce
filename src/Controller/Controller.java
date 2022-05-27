/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Domain.Alignment_NeedlemanWunsch;
import Gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Controller extends JPanel implements ActionListener {

    private GUI g;
    int ingresados = 0, match, mismatch, gap;

    public Controller() {

        g = new GUI();

        g.setVisible(true);
        initializerActions();
    }

    public void initializerActions() {
//		
        g.getBHelp().addActionListener(this);
        g.getBSave().addActionListener(this);
        g.getBMatch().addActionListener(this);
        g.getBMismatch().addActionListener(this);
        g.getBTable().addActionListener(this);
        g.getBToList().addActionListener(this);
        g.getBValue().addActionListener(this);
        g.getbClose().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        
        Alignment_NeedlemanWunsch aligner = new Alignment_NeedlemanWunsch(g.getTFSeq1().toString(), g.getTFSeq2().toString());
        String salida = aligner.printScoreTable();
        if (e.getSource() == g.getBSave()) {
      
          
            
        
        }

        if (e.getSource() == g.getBHelp()) {
            
            
        }
        if (e.getSource() == g.getbClose()) {
          
            System.exit(0);
        }
    }
}
