/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;

import Domain.AlignmentSequence;
import Domain.Alignment_NeedlemanWunsch;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class GUI extends JFrame {

    panelImage panel = new panelImage();

    private String salida;
    //LABELS
    private JLabel jTitulo;
    private JLabel jseq1;
    private JLabel jseq2;
    private JLabel jmatch;
    private JLabel jmismatch;
    private JLabel jgap;
    private JButton bDisableRoute; // Boton de tablas
    private JButton bClose; // BOTON DE CERRAR LA INTERFAZ
    private JButton bValue;// Boton de valor
    private JButton bToList;// Boton de listar
    private JButton bRoute;// Boton de listar
    private JButton bLocalAlig;// Boton de listar
    private JButton bGlobalAlig;// Boton de listar
    //JTextField
    private JTextField tfmatch;
    private JTextField tfmismatch;
    private JTextField tfgap;
    private JTextField tfseq1;
    private JTextField tfseq2;
    //BOTONES
    private JButton bHelp; // Boton de ayuda
    private JButton bPoint; // Boton de guardar
    private JTextArea taPeople;

    public GUI() {

        setBHelp("Ayuda");
        add(bHelp);

        setBPoint("Aplicar");
        add(bPoint);

        setjTitulo("Proyecto 1");
        add(jTitulo);

        setTFMatch(1);
        add(tfmatch);

        setTFMismatch(-1);
        add(tfmismatch);

        setTFGap(-2);
        add(tfgap);

        setTFSeq1("AGGG");
        add(tfseq1);

        setTFSeq2("AGTG");
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

        setTAPeople();
        add(taPeople);

        setbClose("Cerrar");
        add(bClose);

        setBDisableRoute("Desactivar ruta");
        add(bDisableRoute);

        setBValue("Valor");
        add(bValue);

        setBToList("listar");
        add(bToList);

        setBRoute("Activar Ruta");
        add(bRoute);

        setBLocalAlig("Alineamiento Local");
        add(bLocalAlig);

        setBGlobalAlig("Alineamiento Global");
        add(bGlobalAlig);

        initializer();
    }

    public void initializer() {

        this.setTitle("Ventana con Imagen");
        this.setSize(new Dimension(900, 800));
        this.setLocationRelativeTo(null);
        this.add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setjTitulo(String text) {
        jTitulo = new JLabel();
        jTitulo.setText(text);
        jTitulo.setBounds(390, 15, 130, 20);
        jTitulo.setForeground(Color.white);
        jTitulo.setFont(new Font("Algerian", Font.BOLD, 20));

    }

    public JLabel getjTitulo() {
        return jTitulo;
    }

//    public void setjEtiquet(String text) {
//        jEtiquet = new JLabel();
//        jEtiquet.setText(text);
//        jEtiquet.setBounds(10, 30, 350, 30);
//        jEtiquet.setForeground(Color.red);
//        jEtiquet.setFont(new Font("Algerian", Font.BOLD, 15));
//
//    }
//    public JLabel getjEtiquet() {
//        return jEtiquet;
//    }
    public void setjmatch(String text) {
        jmatch = new JLabel();
        jmatch.setVisible(false);
        jmatch.setText(text);
        jmatch.setBounds(10, 150, 115, 15);
        jmatch.setForeground(Color.white);
        jmatch.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjmatch() {
        return jmatch;
    }

    public void setjmismatch(String text) {
        jmismatch = new JLabel();
        jmismatch.setVisible(false);
        jmismatch.setText(text);
        jmismatch.setBounds(130, 150, 115, 15);
        jmismatch.setForeground(Color.white);
        jmismatch.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjmismatch() {
        return jmismatch;
    }

    public void setjgap(String text) {
        jgap = new JLabel();
        jgap.setVisible(false);
        jgap.setText(text);
        jgap.setBounds(250, 150, 115, 15);
        jgap.setForeground(Color.white);
        jgap.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjgap() {
        return jgap;
    }

    public void setjseq1(String text) {
        jseq1 = new JLabel();
        jseq1.setText(text);
        jseq1.setBounds(10, 70, 115, 15);
        jseq1.setForeground(Color.white);
        jseq1.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjseq1() {
        return jseq1;
    }

    public void setjseq2(String text) {
        jseq2 = new JLabel();
        jseq2.setText(text);
        jseq2.setBounds(150, 70, 115, 15);
        jseq2.setForeground(Color.white);
        jseq2.setFont(new Font("Algerian", Font.BOLD, 15));

    }

    public JLabel getjjseq2() {
        return jseq2;
    }

    public void setBHelp(String text) {
        bHelp = new JButton();
        bHelp.setText(text);
        bHelp.setBounds(730, 170, 115, 30);
        bHelp.setFont(new Font("Algerian", Font.BOLD, 15));
        bHelp.setForeground(Color.white);
        bHelp.setBackground(Color.gray);
    }

    public JButton getBHelp() {
        return bHelp;
    }

    public void setBPoint(String text) {
        bPoint = new JButton();
        bPoint.setText(text);
        bPoint.setBounds(8, 220, 115, 30);
        bPoint.setFont(new Font("Algerian", Font.BOLD, 15));
        bPoint.setForeground(Color.white);
        bPoint.setBackground(Color.gray);
    }

    public JButton getBPoint() {
        return bPoint;
    }

    public void setTFMatch(int n) {
        tfmatch = new JTextField();//
        tfmatch.setVisible(false);
        tfmatch.setText(Integer.toString(n));
        tfmatch.setBounds(10, 170, 100, 20);//coordenas x y	 
    }

    public JTextField getTFMatch() {
        return this.tfmatch;
    }

    public void setTFMismatch(int n) {
        tfmismatch = new JTextField();//
        tfmismatch.setVisible(false);
        tfmismatch.setText(Integer.toString(n));
        tfmismatch.setBounds(130, 170, 100, 20);//coordenas x y	 
    }

    public JTextField getTFMismatch() {
        return this.tfmismatch;
    }

    public void setTFGap(int n) {
        tfgap = new JTextField();//
        tfgap.setVisible(false);
        tfgap.setText(Integer.toString(n));
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

    public void setBDisableRoute(String text) {
        bDisableRoute = new JButton();
        bDisableRoute.setText(text);
        bDisableRoute.setBounds(8, 350, 220, 30);
        bDisableRoute.setFont(new Font("Algerian", Font.BOLD, 15));
        bDisableRoute.setForeground(Color.white);
        bDisableRoute.setBackground(Color.gray);
        bDisableRoute.setVisible(false);
    }

    public JButton getBDisableRoute() {
        return bDisableRoute;
    }

    public void setbClose(String text) {
        bClose = new JButton();
        bClose.setText(text);
        bClose.setBounds(740, 700, 115, 30);
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
        bValue.setBounds(8, 400, 115, 30);
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
        bToList.setBounds(8, 450, 115, 30);
        bToList.setFont(new Font("Algerian", Font.BOLD, 15));
        bToList.setForeground(Color.white);
        bToList.setBackground(Color.gray);
    }

    public JButton getBToList() {
        return bToList;
    }

    public void setBRoute(String text) {
        bRoute = new JButton();
        bRoute.setVisible(false);
        bRoute.setText(text);
        bRoute.setBounds(8, 500, 220, 30);
        bRoute.setFont(new Font("Algerian", Font.BOLD, 15));
        bRoute.setForeground(Color.white);
        bRoute.setBackground(Color.gray);
    }

    public JButton getBRoute() {
        return bRoute;
    }

    public void setBGlobalAlig(String text) {
        bGlobalAlig = new JButton();
        bGlobalAlig.setText(text);
        bGlobalAlig.setBounds(8, 550, 220, 30);
        bGlobalAlig.setFont(new Font("Algerian", Font.BOLD, 15));
        bGlobalAlig.setForeground(Color.white);
        bGlobalAlig.setBackground(Color.gray);
    }

    public JButton getBGlobalAlig() {
        return bGlobalAlig;
    }

    public void setBLocalAlig(String text) {
        bLocalAlig = new JButton();
        bLocalAlig.setText(text);
        bLocalAlig.setBounds(8, 600, 220, 30);
        bLocalAlig.setFont(new Font("Algerian", Font.BOLD, 15));
        bLocalAlig.setForeground(Color.white);
        bLocalAlig.setBackground(Color.gray);
    }

    public JButton getBLocalAlig() {
        return bLocalAlig;
    }

    public void setTAPeople() {
        taPeople = new JTextArea();
        taPeople.setLineWrap(true);
        taPeople.setBounds(270, 230, 580, 440);
        taPeople.setBackground(Color.white);
         taPeople.setFont(new Font("Algerian", Font.BOLD, 20));
    }

    public JTextArea getTAPeople() {

        return taPeople;
    }

    //BOTON PARA CERRAR EL JUEGO
    //BOTON PARA REINICIAR EL JUEGO
    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
}
