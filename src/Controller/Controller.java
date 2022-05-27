/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Domain.Alignment_NeedlemanWunsch;
import Domain.Alignment_SmithWaterman;
import Domain.GetMemoryUsed;
import Domain.GetTimeEjecution;
import Domain.Help;
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
        GetTimeEjecution timeUsed = new GetTimeEjecution();
        GetMemoryUsed memoryUsed = new GetMemoryUsed();

        if (e.getSource() == g.getBPoint()) {
            //Inicia el contador de tiempo
            timeUsed.setStartTime(System.currentTimeMillis());

            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch aligner = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);
            
            //Imprimir tiempo y memoria usada
            timeUsed.setFinishTime(System.currentTimeMillis());
            timeUsed.setTotalTime();
            
            g.getTAPeople().setText("Tabla de puntajes \n\n\n" + aligner.printScoreTable() + "\n\n"
                    + "Mejor puntaje: " + aligner.getAlignmentScore() + "\n\n" +timeUsed.toString() + "\n\n"
                    + memoryUsed.printToMemoryUsed());
            g.getBRoute().setVisible(true);


        }

        if (e.getSource() == g.getBRoute()) {
            
            timeUsed.setStartTime(System.currentTimeMillis());
            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch aligner = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);
           
            //Imprimir tiempo y memoria usada
            timeUsed.setFinishTime(System.currentTimeMillis());
            timeUsed.setTotalTime();
            
            g.getTAPeople().setText("Tabla de puntajes con Ruta \n\n\n" + aligner.printScoreAndRuteTable() + "\n\n"
                    + "Mejor puntaje: " + aligner.getAlignmentScore() + "\n\n" +timeUsed.toString() + "\n\n"
                    + memoryUsed.printToMemoryUsed());

            g.getBPoint().setVisible(false);
            g.getBRoute().setVisible(false);
            g.getBDisableRoute().setVisible(true);

        }
        if (e.getSource() == g.getBDisableRoute()) {
            
            timeUsed.setStartTime(System.currentTimeMillis());
            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch aligner = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);
            
            //Imprimir tiempo y memoria usada
            timeUsed.setFinishTime(System.currentTimeMillis());
            timeUsed.setTotalTime();
            
            g.getTAPeople().setText("Tabla de puntajes \n\n\n" + aligner.printScoreTable() + "\n\n"
                    + "Mejor puntaje: " + aligner.getAlignmentScore() + "\n\n" +timeUsed.toString() + "\n\n"
                    + memoryUsed.printToMemoryUsed());

            g.getBRoute().setVisible(true);
            g.getBPoint().setVisible(true);
            g.getBDisableRoute().setVisible(false);
        }

        if (e.getSource() == g.getBLocalAlig()) {
            
            timeUsed.setStartTime(System.currentTimeMillis());
            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_SmithWaterman alignSmith = new Alignment_SmithWaterman(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);
            String[] aligner = alignSmith.getAlignment();
            
            String salida = "Alineamiento Local obtenido con el Algoritmo de\n Smith Waterman \n\n"
                    + "Secuencia 1: " + aligner[0] + "\n" + "Secuencia 2: " + aligner[1];
            //Imprimir tiempo y memoria usada
            timeUsed.setFinishTime(System.currentTimeMillis());
            timeUsed.setTotalTime();
            g.getTAPeople().setText(salida + "\n\n" +timeUsed.toString() + "\n\n"
                    + memoryUsed.printToMemoryUsed());

        }

        if (e.getSource() == g.getBGlobalAlig()) {

            timeUsed.setStartTime(System.currentTimeMillis());
            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch alignNeedleman = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);
            String[] aligner = alignNeedleman.getAlignment();

            String salida = "Alineamiento Local obtenido con el Algoritmo de\n Needleman Wunsch \n\n"
                    + "Secuencia 1: " + aligner[0] + "\n" + "Secuencia 2: " + aligner[1];
            //Imprimir tiempo y memoria usada
            timeUsed.setFinishTime(System.currentTimeMillis());
            timeUsed.setTotalTime();
            
            g.getTAPeople().setText(salida + "\n\n" +timeUsed.toString() + "\n\n"
                    + memoryUsed.printToMemoryUsed());
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
           
            timeUsed.setStartTime(System.currentTimeMillis());
            Help helpOutput = new Help();
            String selection = "Entrar";
            while (!selection.equalsIgnoreCase("Salir")) {

                String[] options = {"Operaciones Implementadas", "Manual de Usuario", "Salir"};
                selection = (String) JOptionPane.showInputDialog(null, "Selecciona el proceso que desea realizar",
                        "Elegir", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                if (selection == "Operaciones Implementadas") {
                    JOptionPane.showMessageDialog(null, helpOutput.getImplementedOperations());

                }
                if (selection == "Mini manual") {
                    selection = "Entrar";
                    while (!selection.equalsIgnoreCase("Regresar")) {
                        String[] options1 = {"Botones", "Valores", "Ingreso de datos", "Salidas", "Regresar"};
                        selection = (String) JOptionPane.showInputDialog(null, "Selecciona el proceso que desea realizar",
                                "Elegir", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                        JOptionPane.showMessageDialog(null, helpOutput.getHandbook(selection));
                    }
                }
            }
        }

        if (e.getSource() == g.getbClose()) {
            
            //JOptionPane.showMessageDialog(null,timeUsed.printFinalTimeUsed() +"\n\n"+ memoryUsed.toString());
            JOptionPane.showMessageDialog(null, 
                      "Yexinio Aguero - B70091                    Jenipher Arce Monestel - C00579\n\n"
                    + "Curso: IF-3001 Algoritmos y Estructuras de Datos - Sede del Atlántico \n" 
                    + "Recinto Paraíso - Facultad de Ciencias Económicas\n" 
                    + "I CICLO 2022 - Fechea entrega:27/05/2022\n"
                    + "Prof. Esteban Arias Méndez \n"
                    + "Bachillerato en Informatica empresarialcarrera - UCR");
            System.exit(0);           
            
        }

    }
}
