package org.example;

public class Bloco4Ex18 {
    public static int getMinNumberInArray(int[] numbers, boolean isMinValue) {
        return Bloco4Utils.getMinOrMaxValueFromArray(numbers, isMinValue);
    }

    public static double getAverageFromArrayValues(int[] numbers) {
        return Bloco4Utils.getAverageFromArrayValues(numbers);
    }

    public static int getProductOfArrayElements(int[] numbers) {
        return Bloco4Utils.getProductOfArrayElements(numbers);
    }

    public static int[] getSetOfNonRepeatedNumbers(int[] numbers) {
        return Bloco4Utils.getSetOfNonRepeatedNumbers(numbers);
    }

    public static int[] getPrimeNumbersFromArray(int[] numbers) {
        if (numbers.length == 0) return null;

        int[] primeNumbers = new int[numbers.length];
        int primeNumbersIndex = 0;
        for (int number : numbers) {
            if (Bloco4Utils.isPrimeNumber(number)) {
                primeNumbers[primeNumbersIndex] = number;
                primeNumbersIndex++;
            }
        }

        /** cleanup **/
        int[] primeNumbersCleanedUpList = new int[primeNumbersIndex];
        for (int i = 0; i < primeNumbersCleanedUpList.length; i++) {
            if (primeNumbers[i] == 0) break;
            primeNumbersCleanedUpList[i] = primeNumbers[i];
        }

        return primeNumbersCleanedUpList;
    }

    public static int[] getPrincipalDiagonalOfMatrix(int[][] matrix) {
        if (!validateMatrixForRectangularSquareAndLength(matrix)) return null;

        int[] principalDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) principalDiagonal[i] = matrix[i][i];

        return principalDiagonal;
    }

    public static int[] getSecondDiagonalOfMatrix(int[][] matrix) {
        if (!validateMatrixForRectangularSquareAndLength(matrix)) return null;

        int[] secondDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++)
            secondDiagonal[i] = matrix[i][matrix.length - 1 - i];

        return secondDiagonal;
    }

    private static boolean validateMatrixForRectangularSquareAndLength(int[][] matrix) {
        if (matrix[0].length == 0) return false;
        if (matrix[1].length == 0) return false;
        if (!Bloco4Utils.checkIfMatrixIsRectangular(matrix) &&
                !Bloco4Utils.checkIfMatrixIsSquare(matrix)) return false;
        return true;
    }

    public static boolean checkIsIdentityMatrix(int[][] matrix) {
        if (matrix[0].length == 0) return false;
        if (matrix[1].length == 0) return false;

        // first I check the 1st diagonal
        for (int i = 0; i < matrix.length; i++)
            if (matrix[i][i] != 1) return false;

        // then I check the 2nd diagonal
        for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++)
            if (matrix[j][i] != 1) return false;

        return true;
    }

    public static int[][] getReversedMatrix(int[][] matrix) {
        if (matrix[0].length == 0) return null;
        if (matrix[1].length == 0) return null;

        int[][] reversedMatrix = new int[matrix.length][matrix.length];
        int reversedMatrixIndex = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            reversedMatrix[i] = Bloco4Utils.getReversedArray(matrix[reversedMatrixIndex]);
            reversedMatrixIndex--;
        }

        return reversedMatrix;
    }

    public static int[][] getTransposedMatrix(int[][] matrix) {
        if (matrix[0].length == 0) return null;
        if (matrix[1].length == 0) return null;

        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }
}
