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
 * @author Jesus Aguero / Jenipher Arce
 */
public class Controller extends JPanel implements ActionListener {
//Clase encargada de darle funcionalidad a los elementos de la gui(Botones, texfields, textArea, labels)

    private GUI g;
    int ingresados = 0, match, mismatch, gap;

    public Controller() {
        //constructor que crea la interfaz
        g = new GUI();

        g.setVisible(true);
        initializerActions();
    }

    public void initializerActions() {
        //Inicializa los elementos de la GUI

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
        //Metodo para darle ActionEvents a los botones
        GetTimeEjecution timeUsed = new GetTimeEjecution();
        GetMemoryUsed memoryUsed = new GetMemoryUsed();

        if (e.getSource() == g.getBPoint()) {
            //boton de imprimir mapa de puntos Global

            //Inicia el contador de tiempo
            timeUsed.setStartTime(System.currentTimeMillis());

            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch aligner = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);

            //Termina el contador de tiempo y ejecuta el calcular tiempo total
            timeUsed.setFinishTime(System.currentTimeMillis());
            timeUsed.setTotalTime();

            //Imprime una tabla de puntajes sin ruta Global y el tiempo y memoria usados 
            g.getTAPeople().setText("Tabla de puntajes \n\n\n" + aligner.printScoreTable() + "\n\n"
                    + "Mejor puntaje: " + aligner.getAlignmentScore() + "\n\n" + timeUsed.toString() + "\n\n"
                    + memoryUsed.printToMemoryUsed());
            g.getBRoute().setVisible(true);

        }

        if (e.getSource() == g.getBRoute()) {
            //boton para imprimir las rutas

            //Empieza a contar el tiempo de ejecusion
            timeUsed.setStartTime(System.currentTimeMillis());
            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch aligner = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);

            //Termina el contador de tiempo y ejecuta el calcular tiempo total
            timeUsed.setFinishTime(System.currentTimeMillis());
            timeUsed.setTotalTime();

            //Imprime una tabla de puntajes con ruta Global y el tiempo y memoria usados 
            g.getTAPeople().setText("Tabla de puntajes con Ruta \n\n\n" + aligner.printScoreAndRuteTable() + "\n\n"
                    + "Mejor puntaje: " + aligner.getAlignmentScore() + "\n\n" + timeUsed.toString() + "\n\n"
                    + memoryUsed.printToMemoryUsed());

            g.getBPoint().setVisible(false);
            g.getBRoute().setVisible(false);
            g.getBDisableRoute().setVisible(true);

        }
        if (e.getSource() == g.getBDisableRoute()) {
            //boton para descativar las rutas

            //Empieza a contar el tiempo de ejecusion
            timeUsed.setStartTime(System.currentTimeMillis());

            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            Alignment_NeedlemanWunsch aligner = new Alignment_NeedlemanWunsch(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);

            //Termina el contador de tiempo y ejecuta el calcular tiempo total
            timeUsed.setFinishTime(System.currentTimeMillis());
            timeUsed.setTotalTime();

            //Imprime una tabla de puntajes sin ruta Global y el tiempo y memoria usados 
            g.getTAPeople().setText("Tabla de puntajes \n\n\n" + aligner.printScoreTable() + "\n\n"
                    + "Mejor puntaje: " + aligner.getAlignmentScore() + "\n\n" + timeUsed.toString() + "\n\n"
                    + memoryUsed.printToMemoryUsed());

            g.getBRoute().setVisible(true);
            g.getBPoint().setVisible(true);
            g.getBDisableRoute().setVisible(false);
        }

        if (e.getSource() == g.getBLocalAlig()) {

            //Empieza a contar el tiempo de ejecusion
            timeUsed.setStartTime(System.currentTimeMillis());
            int match = Integer.parseInt(g.getTFMatch().getText());
            int mismatch = Integer.parseInt(g.getTFMismatch().getText());
            int gap = Integer.parseInt(g.getTFGap().getText());

            //Ejecuta el metodo que devuelve un aliniamiento Local
            Alignment_SmithWaterman alignSmith = new Alignment_SmithWaterman(g.getTFSeq1().getText(),
                    g.getTFSeq2().getText(), match, mismatch, gap);
            String[] aligner = alignSmith.getAlignment();

            String output = "Alineamiento Local obtenido con el Algoritmo de\n Smith Waterman \n\n"
                    + "Secuencia 1: " + aligner[0] + "\n" + "Secuencia 2: " + aligner[1];
            
            //Termina el contador de tiempo y ejecuta el calcular tiempo total
            timeUsed.setFinishTime(System.currentTimeMillis());
            timeUsed.setTotalTime();
            
            
            //imprime los datos del aliniamiento Local y tiempo y memoria usados
            g.getTAPeople().setText(output + "\n\n" + timeUsed.toString() + "\n\n"
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

            String output = "Alineamiento Local obtenido con el Algoritmo de\n Needleman Wunsch \n\n"
                    + "Secuencia 1: " + aligner[0] + "\n" + "Secuencia 2: " + aligner[1];
            
            //Termina el contador de tiempo y ejecuta el calcular tiempo total
            timeUsed.setFinishTime(System.currentTimeMillis());
            timeUsed.setTotalTime();
            
            //Imprime el aliniamiento Global y su tiempo y memoria usados
            g.getTAPeople().setText(output + "\n\n" + timeUsed.toString() + "\n\n"
                    + memoryUsed.printToMemoryUsed());
        }

        if (e.getSource() == g.getBValue()) {
            //Metodo que muestra y habilita para edicion los pesos de match mismatch y gap
            g.getjmatch().setVisible(true);
            g.getTFMatch().setVisible(true);

            g.getjmismatch().setVisible(true);
            g.getTFMismatch().setVisible(true);

            g.getjgap().setVisible(true);
            g.getTFGap().setVisible(true);

        }

        if (e.getSource() == g.getBHelp()) {
            
            //metodo que muestra mensajes de ayuda y un mini manual de usuario
            
            timeUsed.setStartTime(System.currentTimeMillis());
            Help helpOutput = new Help();
            String selection = "Entrar";
            while (!selection.equalsIgnoreCase("Salir")) {
                //utiliza combobox para que pueda elegir los temas que desea ver 
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
        if(e.getSource() == g.getBToList()){
            
            String output = "#Listado de Algoritmos implementados\n\n"
                    + "1. Algoritmo de Alineamiento Global de Needleman Wunsch\n"
                    + "2. Algoritmo de Alineamiento Local de Smith Waterman\n"
                    + "3. Algoritmo de ordenamiento de secuencias programacion Dinamica"
                    + "4. Algoritmo Runtime, que devuelve el uso de memoria"
                    + "5. Algoritmo System.currentTimeMillis() que devuelve el tiempo de ejecusion";
            
            g.getTAPeople().setText(output);
        
        }

        if (e.getSource() == g.getbClose()) {

            //Muestra el tiempo y memoria total usados en todo el proceso
            JOptionPane.showMessageDialog(null,timeUsed.printFinalTimeUsed() +"\n\n"+ memoryUsed.toString());
            //Muestra los datos del proyecto
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
