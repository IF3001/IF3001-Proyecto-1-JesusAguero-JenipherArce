/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Aguero / Jenipher Arce
 */
public class GetMemoryUsed {
//Clase para optener la memoria usada en el proceso 
    
    private static int dataSize = 1024 * 1024;
    //El runtime devuelve memoria en MB
    Runtime runtime;
    private double memoryFinal;

    public String printToMemoryUsed() {
        runtime = Runtime.getRuntime();
        runtime.maxMemory();
        runtime.totalMemory();
        runtime.freeMemory();
        
        String output = "El espacio total consumido es: " 
                 + (runtime.totalMemory() - runtime.freeMemory() / dataSize) + " bytes";
        //suma memoria a la memoria total
        memoryFinal = memoryFinal + (runtime.totalMemory() - runtime.freeMemory() / dataSize);
        
        return output;
    }

    @Override
    //Imprime el total de memoria usada en toda la ejecusion
    public String toString() {
        return "Memoria total usada: " + memoryFinal + " bytes";
    }
    
    

}
