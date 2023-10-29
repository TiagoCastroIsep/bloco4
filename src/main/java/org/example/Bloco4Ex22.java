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
        if (rowSelected > 8 || rowSelected < 0) return false;
        if (columnSelected > 8 || columnSelected < 0) return false;
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

        // defining the loop length based on the last digit of the sortedArray
        // this is just because if the array ends with 7 for example, it would not add 8 and 9 to the missing numbers
        int loopLength = 9;
        if (sortedAvailableNumbers[sortedAvailableNumbers.length - 1] == 9) {
            loopLength = sortedAvailableNumbers.length;
        }

        runLookupLoop(sortedAvailableNumbers, loopLength, currentResult, missingNumbers, currentPosition);

        return missingNumbers;
    }

    private static void runLookupLoop(int[] sortedAvailableNumbers, int loopLength, int currentResult, int[] missingNumbers, int currentPosition) {
        for (int i = 0; i < loopLength; i++) {
            if (i < sortedAvailableNumbers.length) {
                if (sortedAvailableNumbers[i] != currentResult) {
                    missingNumbers[currentPosition] = currentResult;
                    i--;
                    currentPosition++;
                }
                currentResult++;
            } else {
                missingNumbers[currentPosition] = currentResult;
            }
        }
    }

    private static int getMissingNumbersArrayLength(int[] sortedAvailableNumbers) {
        int arrayLength = 0;
        int current = 1;

        if (sortedAvailableNumbers[sortedAvailableNumbers.length - 1] != 9) {
            arrayLength = 9 - sortedAvailableNumbers[sortedAvailableNumbers.length - 1];
        }

        for (int i = 0; i < 9; i++) {
            if (i < sortedAvailableNumbers.length) {
                if (sortedAvailableNumbers[i] != current) {
                    arrayLength++;
                    i--;
                }
                current++;
            }
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
}