/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class GUIData extends JFrame {

    static String Solu[][] = new String[10][10];
    static int row, colum;
    
    static JButton bMatriz[][];
    private JButton bTable; // Boton de tablas
    private JButton bClose; // BOTON DE CERRAR LA INTERFAZ
    private JButton bValue;// Boton de valor
    private JButton bToList;// Boton de listar
    private JButton bmatch;// Boton de listar
    private JButton bmismatch;// Boton de listar
    private JButton bgap;// Boton de listar

    public GUIData() {
        setbClose("Cerrar");
        add(bClose);

        setBTable("Tablas");
        add(bTable);
        
        setBValue("Valor");
        add(bValue);
        
        setBToList("listar");
        add(bToList);
        
        setBMatch("Match");
        add(bmatch);
        
        setBMismatch("Mismatch");
        add(bmismatch);
        
        setBgap("Mismatch");
        add(bgap);
        
        initializer();
    }

    public void initializer() {
        setTitle("titulo");//tituloventana
        setLayout(null);// ordena pero si se pone todo no
        setSize(1000, 1000);// tamano ventana
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cerrar proceso	

    }

    public void setBTable(String text) {
        bTable = new JButton();
        bTable.setText(text);
        bTable.setBounds(8, 30, 115, 30);
        bTable.setFont(new Font("Algerian", Font.BOLD, 15));
        bTable.setForeground(Color.white);
        bTable.setBackground(Color.gray);
    }

    public JButton getBTable() {
        return bTable;
    }

    public void setbClose(String text) {
        bClose = new JButton();
        bClose.setText(text);
        bClose.setBounds(8, 340, 115, 30);
        bClose.setFont(new Font("Algerian", Font.BOLD, 15));
        bClose.setForeground(Color.white);
        bClose.setBackground(Color.gray);
    }

    public JButton getbClose() {
        return this.bClose;
    }

    public void setBValue(String text) {
        bValue = new JButton();
        bValue.setText(text);
        bValue.setBounds(8, 80, 115, 30);
        bValue.setFont(new Font("Algerian", Font.BOLD, 15));
        bValue.setForeground(Color.white);
        bValue.setBackground(Color.gray);
    }

    public JButton getBValue() {
        return bValue;
    }

    public void setBToList(String text) {
        bToList = new JButton();
        bToList.setText(text);
        bToList.setBounds(8, 130, 115, 30);
        bToList.setFont(new Font("Algerian", Font.BOLD, 15));
        bToList.setForeground(Color.white);
        bToList.setBackground(Color.gray);
    }

    public JButton getBToList() {
        return bToList;
    }

    public void setBMatch(String text) {
        bmatch = new JButton();
        bmatch.setText(text);
        bmatch.setBounds(8, 180, 115, 30);
        bmatch.setFont(new Font("Algerian", Font.BOLD, 15));
        bmatch.setForeground(Color.white);
        bmatch.setBackground(Color.gray);
    }

    public JButton getBMatch() {
        return bmatch;
    }

    public void setBgap(String text) {
        bgap = new JButton();
        bgap.setText(text);
        bgap.setBounds(8, 180, 115, 30);
        bgap.setFont(new Font("Algerian", Font.BOLD, 15));
        bgap.setForeground(Color.white);
        bgap.setBackground(Color.gray);
    }

    public JButton getBgap() {
        return bgap;
    }

    public void setBMismatch(String text) {
        bmismatch = new JButton();
        bmismatch.setText(text);
        bmismatch.setBounds(8, 230, 115, 30);
        bmismatch.setFont(new Font("Algerian", Font.BOLD, 15));
        bmismatch.setForeground(Color.white);
        bmismatch.setBackground(Color.gray);
    }

    public JButton getBMismatch() {
        return bmismatch;
    }

    public void Laberinto() {

        int rows = 10;
        int columns = 10;

        row = rows;
        colum = columns;
        bMatriz = new JButton[rows][columns];
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(rows, columns));
        this.add(panel);

        for (int f = 0; f < rows; f++) {
            for (int c = 0; c < columns; c++) {
                bMatriz[f][c] = new JButton();
                bMatriz[f][c].setBounds(150, 170, 400, 100);
                bMatriz[f][c].setBackground(Color.green);
                //POSICION DE LA PANTALLA
                this.setBounds(150, 100, 650, 600);
                panel.setBounds(150, 100, 600, 300);
                panel.add(bMatriz[f][c]);
                panel.setVisible(true);

            }
        }
    }
}
