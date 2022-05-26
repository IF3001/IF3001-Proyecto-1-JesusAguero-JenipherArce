/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author 50685
 */
public abstract class AlignmentSequence extends DynamicAlgorithm{
    
    
   protected int match;
   protected int mismatch;
   protected int gap;
   protected String[] alignments;

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

   protected Object getTraceback() {
      StringBuffer align1Buf = new StringBuffer();
      StringBuffer align2Buf = new StringBuffer();
      Cell currentCell = getTracebackStartingCell();
      while (traceBackIsNotDone(currentCell)) {
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

   protected abstract boolean traceBackIsNotDone(Cell currentCell);

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

   public String[] getAlignment() {
      ensureTableIsFilledIn();
      alignments = (String[]) getTraceback();
      return alignments;
   }

   protected abstract Cell getTracebackStartingCell();
   
   
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
