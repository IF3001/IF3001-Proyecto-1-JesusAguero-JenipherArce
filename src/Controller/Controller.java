/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Domain.Alignment_NeedlemanWunsch;
import Domain.Alignment_SmithWaterman;
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
        g.getBPoint().addActionListener(this);
        g.getBRoute().addActionListener(this);
        g.getBLocalAlig().addActionListener(this);
        g.getBGlobalAlig().addActionListener(this);
        g.getBDisableRoute().addActionListener(this);
        g.getBToList().addActionListener(this);
        g.getBValue().addActionListener(this);
        g.getbClose().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == g.getBPoint()) {

            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch aligner = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);

            g.getTAPeople().setText("Tabla de puntajes \n\n\n" + aligner.printScoreTable() + "\n\n"
                    + "Mejor puntaje: " + aligner.getAlignmentScore());
            g.getBRoute().setVisible(true);
        }

        if (e.getSource() == g.getBRoute()) {

            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch aligner = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);

            g.getTAPeople().setText("Tabla de puntajes con Ruta \n\n\n" + aligner.printScoreAndRuteTable() + "\n\n"
                    + "Mejor puntaje: " + aligner.getAlignmentScore());
            
            
            
            g.getBPoint().setVisible(false);
            g.getBRoute().setVisible(false);
            g.getBDisableRoute().setVisible(true);

        }
        if (e.getSource() == g.getBDisableRoute()) {
           
            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch aligner = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);

            g.getTAPeople().setText("Tabla de puntajes \n\n\n" + aligner.printScoreTable() + "\n\n"
                    + "Mejor puntaje: " + aligner.getAlignmentScore());

             g.getBRoute().setVisible(true);
             g.getBPoint().setVisible(true);
        }

        if (e.getSource() == g.getBLocalAlig()) {
            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_SmithWaterman alignSmith = new Alignment_SmithWaterman(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);
            String[] aligner = alignSmith.getAlignment();

            String salida = "Alineamiento Local obtenido con el Algoritmo de\n Smith Waterman \n\n"
                    + "Secuencia 1: " + aligner[0] + "\n" + "Secuencia 2: " + aligner[1];

            g.getTAPeople().setText(salida);

        }

        if (e.getSource() == g.getBGlobalAlig()) {

            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch alignNeedleman = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);
            String[] aligner = alignNeedleman.getAlignment();

            String salida = "Alineamiento Local obtenido con el Algoritmo de\n Needleman Wunsch \n\n"
                    + "Secuencia 1: " + aligner[0] + "\n" + "Secuencia 2: " + aligner[1];

            g.getTAPeople().setText(salida);
        }

        if (e.getSource() == g.getBValue()) {

            g.getjmatch().setVisible(true);
            g.getTFMatch().setVisible(true);

            g.getjmismatch().setVisible(true);
            g.getTFMismatch().setVisible(true);

            g.getjgap().setVisible(true);
            g.getTFGap().setVisible(true);

        }

        if (e.getSource() == g.getBHelp()) {
            String[] options = {"Operaciones Implementadas", "Mini manual"};
            String selection = (String) JOptionPane.showInputDialog(null, "Selecciona el proceso que desea realizar",
                    "Elegir", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (selection == "Operaciones Implementadas") {
                JOptionPane.showMessageDialog(null,
                        "1. El alineamiento gobal sirve para alinear secuencias que se empieceny acaben en la misma\n  direcion, por ejemplo genes homólogos de especies similares.\n"
                        + "\n"
                        + "2. El alineamiento local suele ser la mejor opción a no ser que se esté seguro de que las\n  secuencias deben de parecerse a lo largo de toda sus extensión\n.");
            }
            if (selection == "Mini manual") {
                JOptionPane.showMessageDialog(null, "El algoritmo va a recibir dos secuencias. Seguidamente, el mismo irá construyendo  una matriz F\n"
                        + " y cada uno de sus elementos F [i, j] será el valor para el alineamiento óptimo de X");
            }
        }

        if (e.getSource() == g.getbClose()) {

            System.exit(0);
        }

    }
}
