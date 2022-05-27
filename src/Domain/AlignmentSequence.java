/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Jesus Aguero / Jenipher Arce
 */
public abstract class AlignmentSequence extends DynamicAlgorithm{
    //Clase Padre del aliniamiento Local y Global que permite alinear las secuencias
    
   protected int match;
   protected int mismatch;
   protected int gap;
   protected String[] alignments;

   //Esta clase recive los pesos y secuencias y aplica los metodos necesarios para optener los puntajes
   public AlignmentSequence(String sequence1, String sequence2) {
      this(sequence1, sequence2, 1, -1, -2);
   }

   public AlignmentSequence(String sequence1, String sequence2, int match,
      int mismatch, int gap) {
      super(sequence1, sequence2);

      this.match = match;
      this.mismatch = mismatch;
      this.gap = gap;
   }
   
   //Metodo que hace el seguimiento para haberiguar cual es el mejor puntaje
   protected Object getTraceback() {
      StringBuffer align1Buf = new StringBuffer();
      StringBuffer align2Buf = new StringBuffer();
      Cell currentCell = getTracebackStartingCell();
      //Corre hasta que no se encuentre mas elementos el rastreo
      while (traceBackIsNotDone(currentCell)) {
          //Con estos if verificamos los datos del aliniamiento Global y asignamos los gabs para optener
          //el mejor aliniamiento con base al aliniamiento Global
         if (currentCell.getRow() - currentCell.getPrevCell().getRow() == 1) {
            align2Buf.insert(0, sequence2.charAt(currentCell.getRow() - 1));
         } else {
            align2Buf.insert(0, '-');
         }
         if (currentCell.getCol() - currentCell.getPrevCell().getCol() == 1) {
            align1Buf.insert(0, sequence1.charAt(currentCell.getCol() - 1));
         } else {
            align1Buf.insert(0, '-');
         }
         currentCell = currentCell.getPrevCell();
      }

      String[] alignments = new String[] { align1Buf.toString(),
            align2Buf.toString() };

      return alignments;
   }
   //Metodo abstracto que se ejecuta en las clases de aliniamiento Global y Local
   protected abstract boolean traceBackIsNotDone(Cell currentCell);

   //Devuelve el puntaje de cada aliniamiento que se guardar en la tabla de puntajes
   public int getAlignmentScore() {
      if (alignments == null) {
         getAlignment();
      }

      int score = 0;
      for (int i = 0; i < alignments[0].length(); i++) {
         char c1 = alignments[0].charAt(i);
         char c2 = alignments[1].charAt(i);
         if (c1 == '-' || c2 == '-') {
            score += gap;
         } else if (c1 == c2) {
            score += match;
         } else {
            score += mismatch;
         }
      }

      return score;
   }
   
   //Optiene las posiciones de cada de puntaje en la tabla
   public String[] getAlignment() {
      ensureTableIsFilledIn();
      alignments = (String[]) getTraceback();
      return alignments;
   }
   
   //Metodo abstracto para encontrar la celda inicial
   protected abstract Cell getTracebackStartingCell();
   
   //Metodo que imprime los elementos guardados dentro de la tabla de puntajes
   public void printScore(){
       String salida = "";
       for (int fila = 0; fila < scoreTable.length; fila++) {
           salida = salida + "\n";
           for (int columna = 0; columna < scoreTable[fila].length; columna++) {
               salida = salida + scoreTable[fila][columna] + "| ";
           }
       }
       
       System.out.println(salida);   
   }
     
}
