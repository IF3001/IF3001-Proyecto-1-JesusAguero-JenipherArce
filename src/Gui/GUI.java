/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gui;


import java.awt.BorderLayout;
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

    //LABELS
    private JLabel jTitulo;
    private JLabel jseq1;
    private JLabel jseq2;
    private JLabel jmatch;
    private JLabel jmismatch;
    private JLabel jgap;
  private JButton bTable; // Boton de tablas
    private JButton bClose; // BOTON DE CERRAR LA INTERFAZ
    private JButton bValue;// Boton de valor
    private JButton bToList;// Boton de listar
    private JButton bmatch;// Boton de listar
    private JButton bmismatch;// Boton de listar
    private JButton bgap;// Boton de listar
    //JTextField
    private JTextField tfmatch;
    private JTextField tfmismatch;
    private JTextField tfgap;
    private JTextField tfseq1;
    private JTextField tfseq2;
    //BOTONES
    private JButton bHelp; // Boton de ayuda
    private JButton bSave; // Boton de guardar
 private JTextArea taPeople;
    public GUI() {

        setBHelp("Ayuda");
        add(bHelp);

        setBSave("Guardar");
        add(bSave);

       
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
   ;
    
  add(taPeople);
        
        
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
        bHelp.setBounds(730, 170, 115, 30);
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
    

    public void setTFMatch(int n) {
        tfmatch = new JTextField();//
        tfmatch.setText(Integer.toString(n));
        tfmatch.setBounds(10, 170, 100, 20);//coordenas x y	 
    }

    public JTextField getTFMatch() {
        return this.tfmatch;
    }

    public void setTFMismatch(int n) {
        tfmismatch = new JTextField();//
        tfmismatch.setText(Integer.toString(n));
        tfmismatch.setBounds(130, 170, 100, 20);//coordenas x y	 
    }

    public JTextField getTFMismatch() {
        return this.tfmismatch;
    }

    public void setTFGap(int n) {
        tfgap = new JTextField();//
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
      public void setBTable(String text) {
        bTable = new JButton();
        bTable.setText(text);
        bTable.setBounds(8, 350, 115, 30);
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

    public void setBMatch(String text) {
        bmatch = new JButton();
        bmatch.setText(text);
        bmatch.setBounds(8, 500, 115, 30);
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
        bgap.setBounds(8, 550, 115, 30);
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
        bmismatch.setBounds(8, 600, 115, 30);
        bmismatch.setFont(new Font("Algerian", Font.BOLD, 15));
        bmismatch.setForeground(Color.white);
        bmismatch.setBackground(Color.gray);
    }

    public JButton getBMismatch() {
        return bmismatch;
    }
 public void setTAPeople(){
         taPeople= new JTextArea();
           taPeople.setLineWrap(true);
           taPeople.setBounds(270,230,580,440);
            taPeople.setBackground(Color.gray);
         }
         public JTextArea getTAPeople(){
return taPeople;
         }

    //BOTON PARA CERRAR EL JUEGO
    //BOTON PARA REINICIAR EL JUEGO
}
