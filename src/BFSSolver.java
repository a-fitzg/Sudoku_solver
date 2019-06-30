/**
 * Solves a sudoku using a BFS (Breadth-First Search) algorithm.
 */
public class BFSSolver {

    // Method that recursively solves a Sudoku
    private boolean solve(Sudoku sudoku) {
        if (sudoku.getFirstEmptyCell() == null) {
            return true;
        }

        // Get first empty location's coordinates
        int[] emptyCoordinate = sudoku.getFirstEmptyCell();
        int row = emptyCoordinate[0];
        int col = emptyCoordinate[1];

        // Try numbers 1..9
        for (int n = 1; n <= 9; n ++) {
            if (sudoku.isLegal(row, col, n)) {
                sudoku.setValue(row, col, n);

                // Keep going until entire sudoku is full
                if (solve(sudoku)) {
                    return true;
                }

                // Must backtrack, clear value and try again with next number
                sudoku.setValue(row, col, 0);
            }
        }

        // No possible solution, exit with false
        return false;

    }

    /**
     * Returns a solved sudoku if solveable, null if unsolveable
     * @param sud Sudoku to be solved
     * @return Sudoku (solved) if solveable, null if unsolveable.
     */
    public Sudoku getSolution(Sudoku sud) {
        if (solve(sud)) {
            return sud;
        } else {
            return null;
        }
    }

}
