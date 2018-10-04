import org.chocosolver.solver.variables.IntVar;

public class SudokuPrinter {
    Sudoku sudoku;

    public SudokuPrinter(Sudoku sudoku) {
        this.sudoku = sudoku;
    }

    public void printIt() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t");
        for (int i = 0; i < sudoku.getN(); i++) {
            for (int j = 0; j < sudoku.getN(); j++) {
                sb.append(sudoku.getRows()[i][j].getValue()).append("  ");
            }
            sb.append("\n\t");
        }
        System.out.println(sb.toString());
    }
}
