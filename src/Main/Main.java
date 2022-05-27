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
        int m = 0;
        for (int i = 0; i < 1000; i++) {

            if (i % 2 == 0) {

                m = m + (i * 2);
            } else {
                m = m - i;

            }
        }
        //new Controller();
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio) / 1000);

        System.out.println("El tiempo total de ejecusion es: " + tiempo
                + "\nEl espacio total consumido es: " + (runtime.totalMemory() - runtime.freeMemory() / 1000) + " ms");
    }

}
