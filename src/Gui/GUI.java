/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;

import if3001.proyecto.pkg1.jesusaguero.jenipherarce.panelImage;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */

public class GUI extends JFrame {

    panelImage panel = new panelImage();

    //LABELS
    private JLabel jTitulo;
    private JLabel jEtiquet;
    private JLabel jseq1;
    private JLabel jseq2;
    private JLabel jmatch;
    private JLabel jmismatch;
    private JLabel jgap;

    //JTextField
    private JTextField tfmatch;
    private JTextField tfmismatch;
    private JTextField tfgap;
    private JTextField tfseq1;
    private JTextField tfseq2;
    //BOTONES
    private JButton bHelp; // Boton de ayuda
    private JButton bSave; // Boton de guardar
    private JButton bSave1; // Boton de guardar

    public GUI() {

        setBHelp("Ayuda");
        add(bHelp);

        setBSave("Guardar");
        add(bSave);

         setBSave1("Guardar");
        add(bSave1);
        
        setjTitulo("Titulo");
        add(jTitulo);
        
          setjEtiquet("Escriba las dos ** que desea comparar");
        add(jEtiquet);

        setTFMatch("");
        add(tfmatch);

        setTFMismatch("");
        add(tfmismatch);

        setTFGap("");
        add(tfgap);

        setTFSeq1("");
        add(tfseq1);

        setTFSeq2("");
        add(tfseq2);

        setjmismatch("Mismatch");
        add(jmismatch);

        setjmatch("Match");
        add(jmatch);

        setjgap("Gap");
        add(jgap);

        setjseq1("Secuencia 1");
        add(jseq1);

        setjseq2("Secuencia 2");
        add(jseq2);

        initializer();
    }

    public void initializer() {

        this.setTitle("Ventana con Imagen");
        this.setSize(new Dimension(600, 600));
        this.setLocationRelativeTo(null);
        this.add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setjTitulo(String text) {
        jTitulo = new JLabel();
        jTitulo.setText(text);
        jTitulo.setBounds(260, 15, 115, 20);
        jTitulo.setForeground(Color.red);
        jTitulo.setFont(new Font("Algerian", Font.BOLD, 20));

    }

    public JLabel getjTitulo() {
        return jTitulo;
    }

    public void setjEtiquet(String text) {
        jEtiquet = new JLabel();
        jEtiquet.setText(text);
        jEtiquet.setBounds(10, 30, 350, 30);
        jEtiquet.setForeground(Color.red);
        jEtiquet.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjEtiquet() {
        return jEtiquet;
    }

    public void setjmatch(String text) {
        jmatch = new JLabel();
        jmatch.setText(text);
        jmatch.setBounds(10, 150, 115, 15);
        jmatch.setForeground(Color.red);
        jmatch.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjmatch() {
        return jmatch;
    }

    public void setjmismatch(String text) {
        jmismatch = new JLabel();
        jmismatch.setText(text);
        jmismatch.setBounds(130, 150, 115, 15);
        jmismatch.setForeground(Color.red);
        jmismatch.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjmismatch() {
        return jmismatch;
    }

    public void setjgap(String text) {
        jgap = new JLabel();
        jgap.setText(text);
        jgap.setBounds(250, 150, 115, 15);
        jgap.setForeground(Color.red);
        jgap.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjgap() {
        return jgap;
    }

    public void setjseq1(String text) {
        jseq1 = new JLabel();
        jseq1.setText(text);
        jseq1.setBounds(10, 70, 115, 15);
        jseq1.setForeground(Color.red);
        jseq1.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjseq1() {
        return jseq1;
    }

    public void setjseq2(String text) {
        jseq2 = new JLabel();
        jseq2.setText(text);
        jseq2.setBounds(150, 70, 115, 15);
        jseq2.setForeground(Color.red);
        jseq2.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjjseq2() {
        return jseq2;
    }

    public void setBHelp(String text) {
        bHelp = new JButton();
        bHelp.setText(text);
        bHelp.setBounds(8, 280, 115, 30);
        bHelp.setFont(new Font("Algerian", Font.BOLD, 15));
        bHelp.setForeground(Color.white);
        bHelp.setBackground(Color.gray);
    }

    public JButton getBHelp() {
        return bHelp;
    }

    public void setBSave(String text) {
        bSave = new JButton();
        bSave.setText(text);
        bSave.setBounds(8, 220, 115, 30);
        bSave.setFont(new Font("Algerian", Font.BOLD, 15));
        bSave.setForeground(Color.white);
        bSave.setBackground(Color.gray);
    }

    public JButton getBSave() {
        return bSave;
    }
     public void setBSave1(String text) {
        bSave1 = new JButton();
        bSave1.setText(text);
        bSave1.setBounds(300,100 , 115, 30);
        bSave1.setFont(new Font("Algerian", Font.BOLD, 15));
        bSave1.setForeground(Color.white);
        bSave1.setBackground(Color.gray);
    }

    public JButton getBSave1() {
        return bSave1;
    }

    public void setTFMatch(String text) {
        tfmatch = new JTextField();//
        tfmatch.setText(text);
        tfmatch.setBounds(10, 170, 100, 20);//coordenas x y	 
    }

    public JTextField getTFMatch() {
        return this.tfmatch;
    }

    public void setTFMismatch(String text) {
        tfmismatch = new JTextField();//
        tfmismatch.setText(text);
        tfmismatch.setBounds(130, 170, 100, 20);//coordenas x y	 
    }

    public JTextField getTFMismatch() {
        return this.tfmismatch;
    }

    public void setTFGap(String text) {
        tfgap = new JTextField();//
        tfgap.setText(text);
        tfgap.setBounds(250, 170, 100, 20);//coordenas x y	 
    }

    public JTextField getTFGap() {
        return this.tfgap;
    }

    public void setTFSeq1(String text) {
        tfseq1 = new JTextField();//
        tfseq1.setText(text);
        tfseq1.setBounds(10, 100, 100, 20);//coordenas x y	 
    }

    public JTextField getTFSeq1() {
        return this.tfseq1;
    }

    public void setTFSeq2(String text) {
        tfseq2 = new JTextField();//
        tfseq2.setText(text);
        tfseq2.setBounds(150, 100, 100, 20);//coordenas x y	 
    }

    public JTextField getTFSeq2() {
        return this.tfseq2;
    }

    //BOTON PARA CERRAR EL JUEGO
    //BOTON PARA REINICIAR EL JUEGO
}
