package q2;
import java.util.ArrayList;

public class Matrix {
    private int numRows;
    private int numColumns;
    private String[][] grid;

    public Matrix(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.grid = new String[numRows][numColumns];
    }

    public void set(int row, int column, String description) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            grid[row][column] = description;
        } else {
            throw new IndexOutOfBoundsException("Row or column out of bounds");
        }
    }

    public String get(int row, int column) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            return grid[row][column];
        } else {
            throw new IndexOutOfBoundsException("Row or column out of bounds");
        }
    }

    public ArrayList<Cell> getDescribedCells() {
        ArrayList<Cell> describedCells = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            for (int column = 0; column < numColumns; column++) {
                if (grid[row][column] != null) {
                    describedCells.add(new Cell(row, column));
                }
            }
        }
        return describedCells;
    }

    public class Cell {
        private int row;
        private int column;

        public Cell(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }
    }

}


