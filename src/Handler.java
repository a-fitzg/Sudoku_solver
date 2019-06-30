public class Handler {

    public static void main(String[] args) {

        BFSSolver solver = new BFSSolver();

        // A NEARLY solved sudoku (except for the last cell)
        Sudoku nearly = new Sudoku(new int[][]{
                { 7, 3, 5, 6, 1, 4, 8, 9, 2 },
                { 8, 4, 2, 9, 7, 3, 5, 6, 1 },
                { 9, 6, 1, 2, 8, 5, 3, 7, 4 },
                { 2, 8, 6, 3, 4, 9, 1, 5, 7 },
                { 4, 1, 3, 8, 5, 7, 9, 2, 6 },
                { 5, 7, 9, 1, 2, 6, 4, 3, 8 },
                { 1, 5, 7, 4, 9, 2, 6, 8, 3 },
                { 6, 9, 4, 7, 3, 8, 2, 1, 5 },
                { 3, 2, 8, 5, 6, 1, 7, 4, 0 } });

        Sudoku sudoku = new Sudoku(new int[][]{
                { 0, 9, 0, 0, 0, 0, 8, 5, 3 },
                { 0, 0, 0, 8, 0, 0, 0, 0, 4 },
                { 0, 0, 8, 2, 0, 3, 0, 6, 9 },
                { 5, 7, 4, 0, 0, 2, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 0, 6, 3, 7 },
                { 9, 4, 0, 1, 0, 8, 5, 0, 0 },
                { 7, 0, 0, 0, 0, 6, 0, 0, 0 },
                { 6, 8, 2, 0, 0, 0, 0, 9, 0 } });

        Sudoku sample1 = new Sudoku(new int[][]{
                { 5, 3, 0, 0, 7, 0, 0, 0, 0},
                { 6, 0, 0, 1, 9, 5, 0, 0, 0},
                { 0, 9, 8, 0, 0, 0, 0, 6, 0},
                { 8, 0, 0, 0, 6, 0, 0, 0, 3},
                { 4, 0, 0, 8, 0, 3, 0, 0, 1},
                { 7, 0, 0, 0, 2, 0, 0, 0, 6},
                { 0, 6, 0, 0, 0, 0, 2, 8, 0},
                { 0, 0, 0, 4, 1, 9, 0, 0, 5},
                { 0, 0, 0, 0, 8, 0, 0, 7, 9} });

        sudoku.print();

        System.out.println("\n\n==========================\n\n");

        if (solver.getSolution(sample1) == null) {
            System.out.println("Sorry, no possible solution. \n");
        } else {
            solver.getSolution(sample1).print();
        }
    }

}
