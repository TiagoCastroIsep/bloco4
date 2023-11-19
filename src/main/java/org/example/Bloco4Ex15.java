package org.example;

public class Bloco4Ex15 {
    public boolean checkMatrixLinesHasTheSameNumberOfColumns(int[][] matrix) {
        if (matrix.length == 0) return false;

        int numberOfColumns = matrix[0].length;
        for (int[] line : matrix) {
            if (line.length != numberOfColumns) return false;
        }

        return true;
    }

    public int getNumberOfColumnsInMatrix(int[][] matrix) {
        if (matrix.length == 0) return -1;

        return matrix[0].length;
    }
}
