/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author 50685
 */
public class Cell {
    
   private Cell prevCell;
   private int score;
   private int row;
   private int col;

   //Inicializamos las filas y columnas
    public Cell(int row, int col) {

        this.row = row;
        this.col = col;
        
    }
    
    //Asignamos el Score
    public int getScore() {
        return score;
    }
    
    //Retornamos el Score
    public void setScore(int score) {
        this.score = score;
    }

    //Asignamos un apuntador a la celda anterior
    public void setPrevCell(Cell prevCell) {
        this.prevCell = prevCell;
    }
    
    //Retornamos la celda anterior
    public Cell getPrevCell() {
        return prevCell;
    }
    
    //Retornamos la fila
    public int getRow() {
        return row;
    }
    
    //Retornamos la columna
    public int getCol() {
        return col;
    }

    @Override
    //un toString para retornar el puntaje guardado y su ubicacion ademas de la celda previa
    public String toString() {
        return "{Celda(" + row + ", " + col + "): Puntaje=" + score + ", Celda anterior="
            + prevCell + "}";
    }
    
    
   
   
}
