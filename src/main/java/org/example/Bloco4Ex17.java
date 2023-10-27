package org.example;

public class Bloco4Ex17 {
    public static boolean checkIfMatrixIsRectangular(int[][] matrix) {
        if (matrix.length == 0) return false;

        int numberOfRows = matrix.length;
        for (int[] line : matrix) {
            if (line.length > numberOfRows) return false;
            if (line.length == numberOfRows) return false;
        }

        return true;
    }
}
