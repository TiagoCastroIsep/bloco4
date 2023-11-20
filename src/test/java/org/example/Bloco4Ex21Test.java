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
    void shouldReturnFalseForRequestedWordEmpty() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word = " ";

        assertFalse(bloco4Ex21.checkIfRequestedWordExistsInLettersMatrix(lettersMatrix, word));
    }

    @Test
    void shouldReturnFalseForRequestedMatrixNotSquare() {
        char[][] lettersMatrix = {
                {'a', 'b'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word = "aei";

        assertFalse(bloco4Ex21.checkIfRequestedWordExistsInLettersMatrix(lettersMatrix, word));
    }

    @Test
    void shouldReturnFalseForRequestedMatrixIsEmpty() {
        char[][] lettersMatrix = {};
        String word = "aei";

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
    void shouldReturnFalseForTwoWordsDontHaveCommonCells() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word1 = "abc";
        String word2 = "def";

        assertFalse(bloco4Ex21.checkCommonCellsForProvidedWords(lettersMatrix, word1, word2));
    }

    @Test
    void shouldReturnFalseForWord1Empty() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word1 = " ";
        String word2 = "def";

        assertFalse(bloco4Ex21.checkCommonCellsForProvidedWords(lettersMatrix, word1, word2));
    }

    @Test
    void shouldReturnFalseForWord2Empty() {
        char[][] lettersMatrix = {
                {'a', 'b', 'c'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word1 = "aei";
        String word2 = " ";

        assertFalse(bloco4Ex21.checkCommonCellsForProvidedWords(lettersMatrix, word1, word2));
    }

    @Test
    void shouldReturnFalseForMatrixEmpty() {
        char[][] lettersMatrix = {};
        String word1 = "aei";
        String word2 = "def";

        assertFalse(bloco4Ex21.checkCommonCellsForProvidedWords(lettersMatrix, word1, word2));
    }

    @Test
    void shouldReturnFalseForMatrixNotSquare_checkCommonCellsForProvidedWords() {
        char[][] lettersMatrix = {
                {'a', 'b'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word1 = "aei";
        String word2 = "def";

        assertFalse(bloco4Ex21.checkCommonCellsForProvidedWords(lettersMatrix, word1, word2));
    }

    @Test
    void shouldReturnFalseForWord1Empty_validateWordsAndMatrixInput() {
        char[][] lettersMatrix = {
                {'a', 'b', 'e'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word1 = " ";
        String word2 = "def";

        assertFalse(bloco4Ex21.validateWordsAndMatrixInput(lettersMatrix, word1, word2));
    }

    @Test
    void shouldReturnFalseForWord2Empty_validateWordsAndMatrixInput() {
        char[][] lettersMatrix = {
                {'a', 'b', 'e'},
                {'d', 'e', 'f'},
                {'g', 'h', 'i'},
        };
        String word1 = "aei";
        String word2 = " ";

        assertFalse(bloco4Ex21.validateWordsAndMatrixInput(lettersMatrix, word1, word2));
    }
}