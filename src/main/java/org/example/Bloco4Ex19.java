package org.example;

import java.util.Arrays;

public class Bloco4Ex19 {
    static Bloco4Utils bloco4Utils = new Bloco4Utils();
    public int getMatrixDeterminantWithLaplaceTheorem(int[][] matrix) {
        if (!bloco4Utils.checkIfMatrixIsSquare(matrix)) return -1;

        int determinant;
        if (matrix.length == 1) determinant = matrix[0][0];
        else if (matrix.length == 2) determinant = getDeterminantOf2x2Matrix(matrix);
        else determinant = getDeterminantOfNxNMatrix(matrix);

        return determinant;
    }

    protected int getDeterminantOfNxNMatrix(int[][] matrix) {
        // formula for matrix {{1, 3, 5}, {2, 4, 6}, {-4, 1, -1}} is:
        // 1*(-1)^1+1 * getDeterminantOf2x2Matrix({{4, 6}, {1, -1}}) -
        // 3*(-1)^1+2 * getDeterminantOf2x2Matrix({{2, 6}, {-4, -1}}) +
        // 5*(-1)^1+3 * getDeterminantOf2x2Matrix({{2, 4}, {-4, 1}})
        int determinant = 0;
        for (int i = 0; i < matrix.length; i++) {
            // matrix of type {{a, b}, {c, d}} so I can do => a*d - b*c
            int[][] subMatrix = getSubMatrix(matrix, i);
            // TODO: this mutation is not possible to kill since a number / -1 or * -1 (except zero) will always change it's signal.
            if (i % 2 == 0) determinant += matrix[0][i] * getMatrixDeterminantWithLaplaceTheorem(subMatrix);
            else determinant += matrix[0][i] * getMatrixDeterminantWithLaplaceTheorem(subMatrix) * -1;
//            determinant += (int) (matrix[0][i] * getMatrixDeterminantWithLaplaceTheorem(subMatrix) * Math.pow(-1, i));
        }
        return determinant;
    }

    protected int[][] getSubMatrix(int[][] matrix, int i) {
        // removing the last line and last column
        int[][] subMatrix = new int[matrix.length - 1][matrix.length - 1];
        for (int j = 1; j < matrix.length; j++) {
            for (int k = 0; k < matrix.length; k++) {
                if (k < i) subMatrix[j - 1][k] = matrix[j][k];
                if (k > i) subMatrix[j - 1][k - 1] = matrix[j][k];
            }
        }
        return subMatrix;
    }

    private int getDeterminantOf2x2Matrix(int[][] matrix) {
        // formula: {{a, b}, {c, d}} = a*d - b*c
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
}
