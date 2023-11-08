package org.example.playground;

public class SumAllElementsOfMatrixWithOneForLoop {
    private static int sum = 0;

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        sumOfMatrixElementsInLineN(matrix, matrix.length - 1);
        System.out.println(sum);
    }

    private static void sumOfMatrixElementsInLineN(int[][] matrix, int lineIndex) {
        if (lineIndex >= 0) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[lineIndex][i];
            }
            sumOfMatrixElementsInLineN(matrix, lineIndex - 1);
        }
    }
}
