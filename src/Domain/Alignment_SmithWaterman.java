package Domain;



/**
 *
 * @author Jesus Aguero / Jenipher Arce
 */
public class Alignment_SmithWaterman extends AlignmentSequence {
//Clase que que aplica el algoritmo de Smith Waterman para optener el alineamiento Local
    
   private Cell highScoreCell;

   public Alignment_SmithWaterman(String sequence1, String sequence2) {
      super(sequence1, sequence2);
   }

   public Alignment_SmithWaterman(String sequence1, String sequence2, int match,
         int mismatch, int gap) {
      super(sequence1, sequence2, match, mismatch, gap);
   }

   protected void initialize() {
       //Metodo que asignixa el valor mas alto de la tabla que sera el valor inicial 
      super.initialize();

      highScoreCell = scoreTable[0][0];
   }

   protected void fillInCell(Cell currentCell, Cell cellAbove, Cell cellToLeft,
           //Metodo que llena las celdas con los distintos puntajes 
           //y ordena la tabla de valores para optener el mejor alineamiento Local
         Cell cellAboveLeft) {
      int rowSpaceScore = cellAbove.getScore() + gap;
      int colSpaceScore = cellToLeft.getScore() + gap;
      int matchOrMismatchScore = cellAboveLeft.getScore();
      if (sequence2.charAt(currentCell.getRow() - 1) == sequence1
            .charAt(currentCell.getCol() - 1)) {
         matchOrMismatchScore += match;
      } else {
         matchOrMismatchScore += mismatch;
      }
      if (rowSpaceScore >= colSpaceScore) {
         if (matchOrMismatchScore >= rowSpaceScore) {
            if (matchOrMismatchScore > 0) {
               currentCell.setScore(matchOrMismatchScore);
               currentCell.setPrevCell(cellAboveLeft);
            }
         } else {
            if (rowSpaceScore > 0) {
               currentCell.setScore(rowSpaceScore);
               currentCell.setPrevCell(cellAbove);
            }
         }
      } else {
         if (matchOrMismatchScore >= colSpaceScore) {
            if (matchOrMismatchScore > 0) {
               currentCell.setScore(matchOrMismatchScore);
               currentCell.setPrevCell(cellAboveLeft);
            }
         } else {
            if (colSpaceScore > 0) {
               currentCell.setScore(colSpaceScore);
               currentCell.setPrevCell(cellToLeft);
            }
         }
      }
      if (currentCell.getScore() > highScoreCell.getScore()) {
         highScoreCell = currentCell;
      }
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
       //Imprime el alineamiento Local 
      return "[Alineamiento Local: sequence1=" + sequence1 + ", sequence2="
            + sequence2 + "]";
   }

   //Metodos abstractos para efectuar el alineamiento
   @Override
   protected boolean traceBackIsNotDone(Cell currentCell) {
      return currentCell.getScore() != 0;
   }

   @Override
   protected Cell getTracebackStartingCell() {
      return highScoreCell;
   }

   @Override
   protected Cell getInitialPointer(int row, int col) {
      return null;
   }

   @Override
   protected int getInitialScore(int row, int col) {
      return 0;
   }
}