/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Controller.Controller;


/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.maxMemory();
        runtime.totalMemory();
        long inicio = System.currentTimeMillis();
        runtime.freeMemory();
        new Controller();
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio)/1000);
        
        
        
        
    }
    
}
