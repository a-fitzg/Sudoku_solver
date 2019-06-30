/**
 * A class representing a sudoku puzzle.
 * Stores sudoku as 9x9 array, blanks stored as 0.
 */
public class Sudoku {

    // 2D array containing the puzzle
    private int[][] sudoku;

    /**
     * Constructor for Sudoku class
     * @param input - 2D 9x9 array oof integers making up a sudoku.
     *                Empty cells stored as 0.
     */
    public Sudoku(int[][] input) {
        this.sudoku = input;
    }

    /**
     * Returns value at given row and column
     * @param row Row number
     * @param col Column Number
     * @return Value at coordinate
     */
    public int getValue(int row, int col) {
        return this.sudoku[row][col];
    }

    /**
     * Sets a sudoku cell to a given value
     * @param row Row number
     * @param col Column Number
     * @param num Number
     */
    public void setValue(int row, int col, int num) {
        this.sudoku[row][col] = num;
    }

    // Checks row for some number
    private boolean inRow(int row, int num) {
        for (int i = 0; i < 9; i ++) {
            if(this.sudoku[row][i] == num) {
                return true;
            }
        }
        return false;
    }

    // Checks column for some number
    private boolean inColumn(int col, int num) {
        for (int i = 0; i < 9; i ++) {
            if(this.sudoku[i][col] == num) {
                return true;
            }
        }
        return false;
    }

    // Checks 3x3 "box" for some number
    private boolean inBox(int row, int col, int num) {
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                if (this.sudoku[i + (row / 3) * 3][j + (col / 3) * 3] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if placing a number at a coordinate would be legal
     * @param row Row number
     * @param col Column Number
     * @param num Number to be placed
     * @return True if legal, False if illegal
     */
    public boolean isLegal(int row, int col, int num) {
        return !inRow(row, num)
                && !inColumn(col, num)
                && !inBox(row, col, num);
    }

    /**
     * Finds first empty cell and returns its value. Returns null if no empty cells
     * @return array of coordinates of first empty cell, or null if no more empty cells
     */
    public int[] getFirstEmptyCell() {
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++) {
                if (this.sudoku[i][j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        // No empty cells
        return null;
    }

    /**
     * Prints this Sudoku to the terminal
     */
    public void print() {
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++) {
                if (this.getValue(i, j) == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(this.getValue(i, j) + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
