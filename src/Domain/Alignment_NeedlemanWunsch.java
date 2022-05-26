/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author 50685
 */
public class Alignment_NeedlemanWunsch extends AlignmentSequence {

    public Alignment_NeedlemanWunsch(String sequence1, String sequence2) {
      super(sequence1, sequence2);
   }

   public Alignment_NeedlemanWunsch(String sequence1, String sequence2, int match,
         int mismatch, int gap) {
      super(sequence1, sequence2, match, mismatch, gap);
   }

   protected void fillInCell(Cell currentCell, Cell cellAbove, Cell cellToLeft,
         Cell cellAboveLeft) {
      int rowSpaceScore = cellAbove.getScore() + gap;
      int colSpaceScore = cellToLeft.getScore() + gap;
      int matchOrMismatchScore = cellAboveLeft.getScore();
      if (sequence2.charAt(currentCell.getRow() - 1) == sequence1.charAt(currentCell.getCol() - 1)) {
         matchOrMismatchScore += match;
      } else {
         matchOrMismatchScore += mismatch;
      }
      if (rowSpaceScore >= colSpaceScore) {
         if (matchOrMismatchScore >= rowSpaceScore) {
            currentCell.setScore(matchOrMismatchScore);
            currentCell.setPrevCell(cellAboveLeft);
         } else {
            currentCell.setScore(rowSpaceScore);
            currentCell.setPrevCell(cellAbove);
         }
      } else {
         if (matchOrMismatchScore >= colSpaceScore) {
            currentCell.setScore(matchOrMismatchScore);
            currentCell.setPrevCell(cellAboveLeft);
         } else {
            currentCell.setScore(colSpaceScore);
            currentCell.setPrevCell(cellToLeft);
         }
      }
   }

   @Override
   protected boolean traceBackIsNotDone(Cell currentCell) {
      return currentCell.getPrevCell() != null;
   }

   @Override
   protected Cell getTracebackStartingCell() {
      return scoreTable[scoreTable.length - 1][scoreTable[0].length - 1];
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#toString()
    */

   protected Cell getInitialPointer(int row, int col) {
      if (row == 0 && col != 0) {
         return scoreTable[row][col - 1];
      } else if (col == 0 && row != 0) {
         return scoreTable[row - 1][col];
      } else {
         return null;
      }
   }

   protected int getInitialScore(int row, int col) {
      if (row == 0 && col != 0) {
         return col * gap;
      } else if (col == 0 && row != 0) {
         return row * gap;
      } else {
         return 0;
      }
   }
   }


