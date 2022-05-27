/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Jesus Aguero / Jenipher Arce
 */
//Clase padre que que aplica la programacion dinamica que crea la matriz y guardar los punatajes en esta
public abstract class DynamicAlgorithm {

    protected String sequence1;
    protected String sequence2;
    protected Cell[][] scoreTable;
    protected boolean tableIsFilledIn;
    protected boolean isInitialized;

    public DynamicAlgorithm(String sequence1, String sequence2) {
        this.sequence1 = sequence1;
        this.sequence2 = sequence2;
        scoreTable = new Cell[sequence2.length() + 1][sequence1.length() + 1];
    }

    public int[][] getScoreTable() {
        //Optiene los valores dentro de la tabla de puntajes y lo retorna en una nueva matriz
        ensureTableIsFilledIn();

        int[][] matrix = new int[scoreTable.length][scoreTable[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scoreTable[i][j].getScore();
            }
        }

        return matrix;
    }
    
    //Inicializa los puntajes 
    protected void initializeScores() {
        for (int i = 0; i < scoreTable.length; i++) {
            for (int j = 0; j < scoreTable[i].length; j++) {
                //Guarda el puntaje dado en el metodo getInitialScore
                scoreTable[i][j].setScore(getInitialScore(i, j));
            }
        }
    }
    
    //Inicializa los punteros para poder seguir la ruta
    protected void initializePointers() {
        for (int i = 0; i < scoreTable.length; i++) {
            for (int j = 0; j < scoreTable[i].length; j++) {
                scoreTable[i][j].setPrevCell(getInitialPointer(i, j));
            }
        }
    }
    
    //Inicializa la la tabla y le asiga un true al metodo isInitialized para saber que ya se inicialiazo 
    //ademas ejecuta los metodos de inciailizar punteros y puntajes 
    protected void initialize() {
        for (int i = 0; i < scoreTable.length; i++) {
            for (int j = 0; j < scoreTable[i].length; j++) {
                scoreTable[i][j] = new Cell(i, j);
            }
        }
        initializeScores();
        initializePointers();

        isInitialized = true;
    }
    //Crea metodos abstractos para que puedan ser ejecutados en la clase hija y usarlos de igual forma en la clase padre o cualquier clase hija
    protected abstract Cell getInitialPointer(int row, int col);

    protected abstract int getInitialScore(int row, int col);

    protected abstract void fillInCell(Cell currentCell, Cell cellAbove,
            Cell cellToLeft, Cell cellAboveLeft);

    //Llena la tabla de puntajes utilizando los metodos abstractos  que se ejecutn en los metodos de aliniamiento
    protected void fillIn() {
        for (int row = 1; row < scoreTable.length; row++) {
            for (int col = 1; col < scoreTable[row].length; col++) {
                Cell currentCell = scoreTable[row][col];
                Cell cellAbove = scoreTable[row - 1][col];
                Cell cellToLeft = scoreTable[row][col - 1];
                Cell cellAboveLeft = scoreTable[row - 1][col - 1];
                fillInCell(currentCell, cellAbove, cellToLeft, cellAboveLeft);
            }
        }
        //le asigna un true para confirmar que la tabla esta llena
        tableIsFilledIn = true;
    }
    //metodo abstracto
    abstract protected Object getTraceback();

    //metodo que imprime los puntajes de la tabla de puntajes y le asigna las rutas
    public String printScoreAndRuteTable() {
        ensureTableIsFilledIn();
        String salida = "";
                
        for (int i = 0; i < sequence2.length() + 2; i++) {
            for (int j = 0; j < sequence1.length() + 2; j++) {
                if (i == 0) {
                    if (j == 0 || j == 1) {
                        salida = salida + "    ";
                    } else {
                        if (j == 2) {
                             salida = salida + "     ";
                        } else {
                             salida = salida + "    ";
                        }
                         salida = salida + sequence1.charAt(j - 2);
                    }
                } else if (j == 0) {
                    if (i == 1) {
                         salida = salida + " ";
                    } else {
                         salida = salida + " " + sequence2.charAt(i - 2);
                    }
                } else {
                    String toPrint;
                    Cell currentCell = scoreTable[i - 1][j - 1];
                    Cell prevCell = currentCell.getPrevCell();
                    if (prevCell != null) {
                        if (currentCell.getCol() == prevCell.getCol() + 1
                                && currentCell.getRow() == prevCell.getRow() + 1) {
                            toPrint = "\\";
                        } else if (currentCell.getCol() == prevCell.getCol() + 1) {
                            toPrint = "- ";
                        } else {
                            toPrint = "|";
                        }
                    } else {
                        toPrint = "      ";
                    }
                    int score = currentCell.getScore();
                    String s = String.format("%1$3d", score);
                    toPrint += s;
                     salida = salida + toPrint;
                }

                 salida = salida + ' ';
            }
             salida = salida + "\n";
        }
        
        return salida;
    }
    //Metodo que imprime solo los puntajes de la tabla de puntajes
    public String printScoreTable() {
        ensureTableIsFilledIn();
        String salida = "";
        for (int i = 0; i < sequence2.length() + 2; i++) {
            for (int j = 0; j < sequence1.length() + 2; j++) {
                if (i == 0) {
                    if (j == 0 || j == 1) {
                        salida = salida + "    ";
                    } else {
                        if (j == 2) {
                            salida = salida + "    ";
                        } else {
                            salida = salida + "   ";
                        }
                       salida = salida + sequence1.charAt(j - 2);
                    }
                } else if (j == 0) {
                    if (i == 1) {
                        salida = salida + "  ";
                    } else {
                        salida = salida + " " + sequence2.charAt(i - 2);
                    }
                } else {
                    String toPrint = " ";
                    Cell currentCell = scoreTable[i - 1][j - 1];
                    Cell prevCell = currentCell.getPrevCell();
                    if (prevCell == null) {
                        
                        toPrint = "   ";
                    }
                    int score = currentCell.getScore();
                    String s = String.format("%1$3d", score);
                    toPrint += s;
                    salida = salida + toPrint;
                }

                salida = salida + ' ';
            }
            salida = salida + "\n";
        }
        
        return salida;
                
    }
    
    //Metodo que verifica si la tabla esta vacia o sin inicializar y la llena o la inicializa
    protected void ensureTableIsFilledIn() {
        if (!isInitialized) {
            initialize();
        }
        if (!tableIsFilledIn) {
            fillIn();
        }
    }

}
