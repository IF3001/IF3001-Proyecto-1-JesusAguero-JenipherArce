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
//Clase para obtener la memoria usada en el proceso 
    
    private static int dataSize = 1024 * 1024;
    //El runtime devuelve memoria en MB
    Runtime runtime;
    private double memoryFinal = 0.0;

    public Double MemoryUsed() {
        runtime = Runtime.getRuntime();
        runtime.maxMemory();
        runtime.totalMemory();
        runtime.freeMemory();
        
        double memoryUsed = (runtime.totalMemory() - runtime.freeMemory() / dataSize);

        memoryFinal = memoryFinal + (runtime.totalMemory() - runtime.freeMemory());
        
        return memoryUsed;
    }

    @Override
    //Imprime el total de memoria usada en toda la ejecucion
    public String toString() {
        return "Memoria usada: " + MemoryUsed() + " bytes";
    }
    
    public String printMemoryFinal(){
        
        return "Memoria total usada: " + (memoryFinal/dataSize) + " bytes";
    }
    
    

}
