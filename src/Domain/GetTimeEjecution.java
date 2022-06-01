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
//Clase que devuelve el tiempo de ejecucion
    private long startTime;
    private long finishTime;
    private double totalTime;
    private double totalFinalTime = 0.0;

    
    //Asigna un tiempo de inicio
    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    //Asigna un tiempo de finalizacion
    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public void setTotalFinalTime(double totalTime) {
        this.totalFinalTime = totalFinalTime + totalTime;
    }

    
    //asigna el tiempo total de ejecucion
    public void setTotalTime() {
        totalTime = (double) (finishTime - startTime) / 1000;
        
        setTotalFinalTime(totalTime);
    }

    public double getTotalFinalTime() {
        return totalFinalTime;
    }
    

    public String printFinalTimeUsed() {
        String output = "El tiempo total de ejcucion es de: " + totalFinalTime + " ms";
        
        return output;
    }

    @Override
    public String toString() {
        return "El tiempo total es de ejecucion es: " + totalTime + " ms";
    }

}
