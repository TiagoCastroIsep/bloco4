package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Bloco4Ex22 {
    public static boolean checkGameOver(int[][] gameMatrix) {
        int[][] maskMatrix = getFreeSlotsMaskMatrix(gameMatrix);
        if (maskMatrix == null) return false;

        for (int[] matrix : maskMatrix) {
            for (int i : matrix) {
                if (i == 0) return false;
            }
        }

        return true;
    }

    public static int[][] updateGameMatrix(int[][] gameMatrix, int rowSelected, int columnSelected, int numberSelected) {
        if (!validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected)) return null;
        gameMatrix[rowSelected][columnSelected] = numberSelected;
        return gameMatrix;
    }

    /** returned selection[0] is a row check for the missing numbers **/
    /** returned selection[1] is a column check for the missing numbers **/
    public static int[][] getPlayerChoicesForGivenSelection(int[][] gameMatrix, int rowSelected, int columnSelected) {
        if (gameMatrix[rowSelected][columnSelected] != 0) return null;

        int[] filledNumbersInRow = getAlreadyFilledSlotsArray(gameMatrix, rowSelected, true);
        int[] filledNumbersInColumn = getAlreadyFilledSlotsArray(gameMatrix, columnSelected, false);

        int[] sortedAvailableNumbersInRow = getSortedArray(filledNumbersInRow);
        int[] sortedAvailableNumbersInColumn = getSortedArray(filledNumbersInColumn);

        // finding the missing numbers in row
        int[] missingRowNumbers = runLookupForMissingNumbers(sortedAvailableNumbersInRow);
        // finding the missing numbers in column
        int[] missingColumnNumbers = runLookupForMissingNumbers(sortedAvailableNumbersInColumn);

        return new int[][] {
                missingRowNumbers,
                missingColumnNumbers
        };
    }

    public static boolean validateUserSelection(int[][] gameMatrix, int rowSelected, int columnSelected, int numberSelected) {
        int[][] playersPossibleChoices = getPlayerChoicesForGivenSelection(gameMatrix, rowSelected, columnSelected);
        if (playersPossibleChoices == null) return false;

        int commonValue = 0;
        // compare both arrays, keep only the common value
        for (int i = 0; i < playersPossibleChoices[0].length; i++) {
            for (int j = 0; j < playersPossibleChoices[1].length; j++) {
                if (playersPossibleChoices[0][i] == playersPossibleChoices[1][j]) {
                    commonValue = playersPossibleChoices[1][j];
                }
            }
        }

        // I found out that when I intersect the row lookup possible results and the column lookup possible results
        // I'll always keep the only possible solution for the given slot. Therefore, the end result is given below:
        return numberSelected == commonValue;
    }

    /** could be set to private if wasn't requested in the Exercise form
     * I'm using this! **/
    public static int[] getAlreadyFilledSlotsArray(int[][] gameMatrix, int rowOrColumnNumber, boolean isRow) {
        int count = 0;
        if (isRow) {
            return runRowLookup(gameMatrix, rowOrColumnNumber, count);
        }

        return runColumnLookup(gameMatrix, rowOrColumnNumber, count);
    }

    /** On the game execution, after the updateGameMatrix is done I also need to run the getFreeSlotsMaskMatrix **/
    /** could be set to private if wasn't requested in the Exercise form **/
    public static int[][] getFreeSlotsMaskMatrix(int[][] gameMatrix) {
        if (gameMatrix.length == 0) return null;
        if (gameMatrix[0].length != gameMatrix.length) return null;
        int[][] maskMatrix = new int[gameMatrix.length][gameMatrix[0].length];

        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix[i].length; j++) if (gameMatrix[i][j] != 0) maskMatrix[i][j] = 1;
        }

        return maskMatrix;
    }

    private static int[] runLookupForMissingNumbers(int[] sortedAvailableNumbers) {
        int arrayLength = getMissingNumbersArrayLength(sortedAvailableNumbers);

        int[] missingNumbers = new int[arrayLength];
        int currentPosition = 0;
        int currentResult = 1;
        for (int i = 0; i < sortedAvailableNumbers.length; i++) {
            if (sortedAvailableNumbers[i] != currentResult) {
                missingNumbers[currentPosition] = currentResult;
                i--;
                currentPosition++;
            }
            currentResult++;
        }

        return missingNumbers;
    }

    private static int getMissingNumbersArrayLength(int[] sortedAvailableNumbers) {
        int arrayLength = 0;
        int current = 1;
        for (int i = 0; i < sortedAvailableNumbers.length; i++) {
            if (sortedAvailableNumbers[i] != current) {
                arrayLength++;
                i--;
            }
            current++;
        }
        return arrayLength;
    }

    private static int[] getSortedArray(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }

    private static int[] runColumnLookup(int[][] gameMatrix, int rowOrColumnNumber, int count) {
        for (int i = 0; i < gameMatrix.length; i++) if (gameMatrix[i][rowOrColumnNumber] > 0) count++;
        int[] availableNumbers = new int[count];

        int currPosition = 0;
        for (int i = 0; i < gameMatrix.length; i++) {
            if (gameMatrix[i][rowOrColumnNumber] > 0) {
                availableNumbers[currPosition] = gameMatrix[i][rowOrColumnNumber];
                currPosition++;
            }
        }
        return availableNumbers;
    }

    private static int[] runRowLookup(int[][] gameMatrix, int rowOrColumnNumber, int count) {
        for (int i = 0; i < gameMatrix.length; i++) if (gameMatrix[rowOrColumnNumber][i] > 0) count++;
        int[] availableNumbers = new int[count];

        int currPosition = 0;
        for (int i = 0; i < gameMatrix.length; i++) {
            if (gameMatrix[rowOrColumnNumber][i] > 0) {
                availableNumbers[currPosition] = gameMatrix[rowOrColumnNumber][i];
                currPosition++;
            }
        }

        return availableNumbers;
    }

    public static void main(String[] args) {
        // example of execution
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };

        System.out.println(Arrays.deepToString(gameMatrix).replace("], ",
                "]\n").replace("[[", "[").replace("]]", "]"));

        boolean gameOver = false;

        while (!gameOver) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the row number: ");
            int rowSelected = scanner.nextInt();
            System.out.println("Please enter the column number: ");
            int columnSelected = scanner.nextInt();
            System.out.println("Please enter the number: ");
            int numberSelected = scanner.nextInt();

            if (validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected)) {
                gameMatrix = updateGameMatrix(gameMatrix, rowSelected, columnSelected, numberSelected);
                System.out.println("The game matrix was updated! Your choice was correct!");
            } else {
                System.out.println("The game matrix was not updated! Your choice was incorrect or the slot is already filled!");
            }

            System.out.println("The game matrix is: ");
            System.out.println(Arrays.deepToString(gameMatrix).replace("], ",
                    "]\n").replace("[[", "[").replace("]]", "]"));

            gameOver = checkGameOver(gameMatrix);

            if (gameOver) {
                System.out.println("Game Over!");
            }

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Do you want to continue? (Y/N)");
            String continueGame = scanner2.nextLine();
            if (continueGame.equals("N")) {
                gameOver = true;
            }
        }
    }
}