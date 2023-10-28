package org.example;

public class Bloco4Ex20 {

    public static int[][] getProductOfAMatrixForOneConstant(int[][] matrix, int constant) {
        if (constant == 0) return null;
        if (matrix.length == 0) return null;

        int[][] productMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) productMatrix[i][j] = matrix[i][j] * constant;
        }

        return productMatrix;
    }

    public static int[][] getSumOfTwoMatrices(int[][] matrix1, int[][] matrix2) {
        if (validateMatricesSizeNotEquals(matrix1, matrix2)) return null;

        int[][] sumMatrix = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        }

        return sumMatrix;
    }

    public static int[][] getProductOfTwoMatrices(int[][] matrix1, int[][] matrix2) {
        if (validateMatricesSizeNotEquals(matrix1, matrix2)) return null;

        int[][] productMatrix = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++)
                productMatrix[i][j] = getSumOfProductsOfMatrixLinesAndColumns(matrix1, matrix2, i, j);
        }

        return productMatrix;
    }

    private static int getSumOfProductsOfMatrixLinesAndColumns(int[][] matrix1, int[][] matrix2, int i, int j) {
        if (validateMatricesSizeNotEquals(matrix1, matrix2)) return -1;

        int sum = 0;
        for (int k = 0; k < matrix1.length; k++) sum += matrix1[i][k] * matrix2[k][j];
        return sum;
    }

    private static boolean validateMatricesSizeNotEquals(int[][] matrix1, int[][] matrix2) {
        return matrix1.length != matrix2.length;
    }
}
