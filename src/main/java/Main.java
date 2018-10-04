
public class Main {
    public static void main(String[] args) {
        Integer[][] gridData = new Integer[][]{
                {3, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 2, 0}
        };
        Sudoku s = new Sudoku(gridData);
        if (s.solve()){
            SudokuPrinter printer = new SudokuPrinter(s);
            printer.printIt();
        } else {
            System.out.println("sem solução");
        }
    }
}
