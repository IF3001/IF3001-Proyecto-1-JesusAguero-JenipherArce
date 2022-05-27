/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author 50685
 */
public class GetTimeEjecution {

    private long startTime;
    private long finishTime;
    private double totalTime;
    private double totalFinalTime;

    public GetTimeEjecution() {
    }

    public float getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public float getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(long finishTime) {
        this.finishTime = finishTime;
    }

    public double getTotalTime() {
        return totalTime;
    }

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
