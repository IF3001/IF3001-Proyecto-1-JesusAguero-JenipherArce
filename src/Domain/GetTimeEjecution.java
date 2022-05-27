/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Jesus Aguero / Jenipher Arce
 */
public class GetTimeEjecution {
//Clase que devuelve el tiempo de ejecusion
    private long startTime;
    private long finishTime;
    private double totalTime;
    private double totalFinalTime;

    
    //Asigna un tiempo de inicio
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    //Asigna un tiempo de finalizacion
    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    //asigna el tiempo total de ejecusion
    public void setTotalTime() {
        totalTime = (double) (finishTime - startTime) / 10000;
        totalFinalTime = totalFinalTime + (double) (finishTime - startTime) / 1000;
    }

    public String printFinalTimeUsed() {
        String output = "El tiempo total de ejcucion es de: " + totalFinalTime;
        
        return output;
    }

    @Override
    public String toString() {
        return "El tiempo total es de ejecusion es: " + totalTime + " ms";
    }

}
