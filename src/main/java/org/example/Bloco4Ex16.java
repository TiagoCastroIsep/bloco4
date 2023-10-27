package org.example;

public class Bloco4Ex16 {
    public static boolean checkIfMatrixIsSquare(int[][] matrix) {
        if (matrix.length == 0) return false;

        int matrixLength = matrix.length;
        for (int[] line : matrix) {
            if (line.length != matrixLength) return false;
        }

        return true;
    }
}
