/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import javax.swing.JOptionPane;

/**
 *
 * @author 50685
 */
public class GetMemoryUsed {

    private static int dataSize = 1024 * 1024;
    Runtime runtime;
    private double memoryFinal;

    public String printToMemoryUsed() {
        runtime = Runtime.getRuntime();
        runtime.maxMemory();
        runtime.totalMemory();
        runtime.freeMemory();
        
        String output = "El espacio total consumido es: " 
                 + (runtime.totalMemory() - runtime.freeMemory() / dataSize) + " bytes";
        memoryFinal = memoryFinal + (runtime.totalMemory() - runtime.freeMemory() / dataSize);
        
        return output;
    }

    @Override
    public String toString() {
        return "Memoria total usada: " + memoryFinal + " bytes";
    }
    
    

}
