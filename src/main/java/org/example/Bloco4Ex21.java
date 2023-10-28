package org.example;

import java.util.Arrays;

public class Bloco4Ex21 {
    /** this method should have been matched with the checkIfRequestedWordExistsInLettersMatrix method
     * I can refactor it later on **/
    // Alinea a)
    public static int[][] getMaskMatrixFromSingleChar(char[][] lettersMatrix, char requestedLetter) {
        if (lettersMatrix.length == 0) return null;
        if (lettersMatrix[0].length != lettersMatrix.length) return null;

        int[][] maskMatrix = new int[lettersMatrix.length][lettersMatrix[0].length];
        for (int i = 0; i < lettersMatrix.length; i++) {
            for (int j = 0; j < lettersMatrix[0].length; j++) {
                if (lettersMatrix[i][j] == requestedLetter) maskMatrix[i][j] = 1;
                else maskMatrix[i][j] = 0;
            }
        }

        return maskMatrix;
    }

    // Alinea b)... e c) também nesta mesma solução?
    public static boolean checkIfRequestedWordExistsInLettersMatrix(char[][] lettersMatrix, String word) {
        if (word.trim().isEmpty()) return false;
        if (lettersMatrix.length == 0) return false;
        if (lettersMatrix.length != lettersMatrix[0].length) return false;

        char[] wordCharactersArray = getCharArrayFromStringWord(word);

        int[][] maskMatrix = findMaskMatrixFromProvidedWord(lettersMatrix, wordCharactersArray);

        /** if assumed that we can have repeating characters then add extra validation for the sum in the matrix **/
        /** for simplicity, I just assumed that characters are unique
         * otherwise: I'll need to perform a full scan on the matrix for lines, columns and diagonals adding those methods **/
        int sum = sumAllMatrixElements(maskMatrix);

        return sum == maskMatrix.length;
    }

    private static int sumAllMatrixElements(int[][] maskMatrix) {
        int sum = 0;
        for (int[] matrix : maskMatrix) {
            for (int j = 0; j < maskMatrix.length; j++) {
                sum += matrix[j];
            }
        }

        return sum;
    }

    private static int[][] findMaskMatrixFromProvidedWord(char[][] lettersMatrix, char[] wordCharactersArray) {
        int[][] maskMatrix = new int[lettersMatrix.length][lettersMatrix[0].length];
        for (int i = 0; i < lettersMatrix.length; i++) {
            for (int j = 0; j < lettersMatrix.length; j++) {
                for (char c : wordCharactersArray) {
                    if (lettersMatrix[i][j] == c) {
                        maskMatrix[i][j] = 1;
                        break;
                    }
                }
            }
        }

        return maskMatrix;
    }

    private static char[] getCharArrayFromStringWord(String word) {
        char[] wordCharactersArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) wordCharactersArray[i] = word.charAt(i);
        return wordCharactersArray;
    }

    // Alínea d)
    public static boolean checkCommonCellsForProvidedWords(char[][] lettersMatrix, String word1, String word2) {
        if (!validateWordsAndMatrixInput(lettersMatrix, word1, word2)) return false;

        char[] wordCharsArray1 = getCharArrayFromStringWord(word1);
        char[] wordCharsArray2 = getCharArrayFromStringWord(word2);

        int[][] maskMatrix1 = findMaskMatrixFromProvidedWord(lettersMatrix, wordCharsArray1);
        int[][] maskMatrix2 = findMaskMatrixFromProvidedWord(lettersMatrix, wordCharsArray2);

        System.out.println(Arrays.deepToString(maskMatrix1));
        System.out.println(Arrays.deepToString(maskMatrix2));

        boolean hasCommonCell = false;
        for (int i = 0; i < lettersMatrix.length; i++) {
            for (int j = 0; j < lettersMatrix.length; j++) {
                if (maskMatrix1[i][j] == maskMatrix2[i][j] && maskMatrix1[i][j] == 1) {
                    hasCommonCell = true;
                    break;
                }
            }
        }

        return hasCommonCell;
    }

    private static boolean validateWordsAndMatrixInput(char[][] lettersMatrix, String word1, String word2) {
        if (word1.trim().isEmpty()) return false;
        if (word2.trim().isEmpty()) return false;
        if (lettersMatrix.length == 0) return false;
        if (lettersMatrix.length != lettersMatrix[0].length) return false;
        return true;
    }

}
