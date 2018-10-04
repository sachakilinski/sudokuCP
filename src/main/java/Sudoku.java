import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.variables.IntVar;

public class Sudoku {

    private final int n = 4;

    private IntVar[][] cols, rows, sectors;

    private Model model;

    public Sudoku(Integer[][] gridData) {
        this.model = new Model("Sudoku");
        this.init(gridData);
    }


    public Boolean solve() {
        for (int i = 0; i < 4; i++) {
            model.allDifferent(rows[i]).post();
            model.allDifferent(cols[i]).post();
            model.allDifferent(sectors[i]).post();
        }

        Solver solver = model.getSolver();
        return solver.solve();
    }

    private void init(Integer[][] gridData) {

        rows = new IntVar[n][n];
        cols = new IntVar[n][n];
        sectors = new IntVar[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (gridData[i][j] > 0) {
                    rows[i][j] = model.intVar(gridData[i][j]);
                } else {
                    rows[i][j] = model.intVar("c_" + i + "_" + j, 1, n);
                }
                cols[j][i] = rows[i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    sectors[j + k * 2][i] = rows[k * 2][i + j * 2];
                    sectors[j + k * 2][i + 2] = rows[1 + k * 2][i + j * 2];
                }
            }
        }
    }

    public int getN() {
        return n;
    }

    public IntVar[][] getRows() {
        return rows;
    }

}