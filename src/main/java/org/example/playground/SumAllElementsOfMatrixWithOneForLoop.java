package org.example.playground;

public class SumAllElementsOfMatrixWithOneForLoop {
    private static int sum = 0;

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum1 = 0;
        sumOfMatrixElementsInLineN(matrix, matrix.length - 1);
        System.out.println(sum);

        System.out.println(getSumMatrixElementsInLineN(matrix, matrix.length - 1, sum1));
    }

    private static void sumOfMatrixElementsInLineN(int[][] matrix, int lineIndex) {
        if (lineIndex >= 0) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[lineIndex][i];
            }
            sumOfMatrixElementsInLineN(matrix, lineIndex - 1);
        }
    }

    // without using global variable
    private static int getSumMatrixElementsInLineN(int[][] matrix, int lineIndex, int sum) {
        if (lineIndex >= 0) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[lineIndex][i];
            }
            return getSumMatrixElementsInLineN(matrix, lineIndex - 1, sum);
        }
        return sum;
    }
}
