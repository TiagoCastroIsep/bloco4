package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex21Test {
    static final Bloco4Ex21 bloco4Ex21 = new Bloco4Ex21();
    @Test
    void shouldReturnMaskMatrixForRequestLetterA() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        char requestedLetter = 'a';
        int[][] expected = {
                {1, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
        assertArrayEquals(expected, bloco4Ex21.getMaskMatrixFromSingleChar(lettersMatrix, requestedLetter));
    }

    @Test
    void shouldReturnAllZerosMaskMatrixForRequestLetterNotInLettersMatrix() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        char requestedLetter = 'k';
        int[][] expected = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
        assertArrayEquals(expected, bloco4Ex21.getMaskMatrixFromSingleChar(lettersMatrix, requestedLetter));
    }

    @Test
    void shouldReturnNullMatrixForEmptyLettersMatrix() {
        char[][] lettersMatrix = {{}};
        char requestedLetter = 'a';
        assertNull(bloco4Ex21.getMaskMatrixFromSingleChar(lettersMatrix, requestedLetter));
    }

    /** Alínea b) e talvez também c) **/
    @Test
    void shouldReturnTrueForRequestedWordFound() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word = "aei";

        assertTrue(bloco4Ex21.checkIfRequestedWordExistsInLettersMatrix(lettersMatrix, word));
    }

    @Test
    void shouldReturnFalseForRequestedWordNotFound() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word = "kae";

        assertFalse(bloco4Ex21.checkIfRequestedWordExistsInLettersMatrix(lettersMatrix, word));
    }

    @Test
    void shouldReturnFalseForMatrixNotSquare() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'}
        };
        String word = "kae";

        assertFalse(bloco4Ex21.checkIfRequestedWordExistsInLettersMatrix(lettersMatrix, word));
    }

    /** Alínea d) **/
    @Test
    void shouldReturnTrueForTwoWordsHavingCommonCells() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word1 = "aei";
        String word2 = "ceg";

        assertTrue(bloco4Ex21.checkCommonCellsForProvidedWords(lettersMatrix, word1, word2));
    }

    @Test
    void shouldReturnTrueForTwoWordsDontHaveCommonCells() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word1 = "abc";
        String word2 = "def";

        assertFalse(bloco4Ex21.checkCommonCellsForProvidedWords(lettersMatrix, word1, word2));
    }
}