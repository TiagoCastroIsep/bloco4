package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex18Test {
    @Test
    void shouldReturnMinNumberInArray() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        assertEquals(2, Bloco4Ex18.getMinNumberInArray(numbers, true));
    }

    @Test
    void shouldReturnMaxNumberInArray() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        assertEquals(8, Bloco4Ex18.getMinNumberInArray(numbers, false));
    }

    @Test
    void shouldReturnAverageFromArrayValues() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        assertEquals(4.55, Bloco4Ex18.getAverageFromArrayValues(numbers), 0.01);
    }

    @Test
    void shouldReturnProductOfArrayElements() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        assertEquals(403200, Bloco4Ex18.getProductOfArrayElements(numbers));
    }

    @Test
    void shouldReturnSetOfNonRepeatedNumbers() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        assertArrayEquals(new int[] {2, 3, 4, 5, 8, 7}, Bloco4Ex18.getSetOfNonRepeatedNumbers(numbers));
    }

    @Test
    void shouldReturnNullWhenArrayIsEmpty() {
        int[] numbers = new int[0];
        assertNull(Bloco4Ex18.getSetOfNonRepeatedNumbers(numbers));
    }

    @Test
    void shouldReturnPrimeNumbersFromArray() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        int[] expected = new int[] {2, 3, 5, 3, 5, 7};
        assertArrayEquals(expected, Bloco4Ex18.getPrimeNumbersFromArray(numbers));
    }

    @Test
    void shouldReturnNullForEmptyNumbersArray() {
        int[] numbers = new int[0];
        assertNull(Bloco4Ex18.getPrimeNumbersFromArray(numbers));
    }

    @Test
    void shouldReturnPrincipalDiagonalOfMatrix() {
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertArrayEquals(new int[] {1, 5, 9}, Bloco4Ex18.getPrincipalDiagonalOfMatrix(matrix));
    }

    @Test
    void shouldReturnNullForMatrixAtZeroEqualsZeroAtPrincipalDiagonal() {
        int[][] matrix = new int[][] {{}};
        assertNull(Bloco4Ex18.getPrincipalDiagonalOfMatrix(matrix));
    }

    @Test
    void shouldReturnCorrectResultForMatrixNotRectangularAtPrincipalDiagonal() {
        int[][] matrix = new int[][] {{1, 2}, {4, 5}};
        int[] expected = new int[] {1, 5};
        assertArrayEquals(expected, Bloco4Ex18.getPrincipalDiagonalOfMatrix(matrix));
    }

    @Test
    void shouldReturnCorrectResultForMatrixNotRectangularAtSecondaryDiagonal() {
        int[][] matrix = new int[][] {{1, 2}, {4, 5}};
        int[] expected = new int[] {2, 4};
        assertArrayEquals(expected, Bloco4Ex18.getSecondDiagonalOfMatrix(matrix));
    }

    @Test
    void shouldReturnTrueForIsIdentityMatrix() {
        int[][] matrix = new int[][] {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };
        assertTrue(Bloco4Ex18.checkIsIdentityMatrix(matrix));
    }

    @Test
    void shouldReturnFalseForIsNotIdentityMatrix() {
        int[][] matrix = new int[][] {
                {1, 0, 0},
                {0, 1, 0},
                {1, 0, 1}
        };
        assertFalse(Bloco4Ex18.checkIsIdentityMatrix(matrix));
    }

    @Test
    void shouldReturnFalseForMatrixIsEmptyAtCheckIsIdentityMatrix() {
        int[][] matrix = new int[][] {{}};
        assertFalse(Bloco4Ex18.checkIsIdentityMatrix(matrix));
    }

    @Test
    void shouldReturnReversedMatrix() {
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertArrayEquals(new int[][] {
                {6, 5, 4},
                {3, 2, 1}
        }, Bloco4Ex18.getReversedMatrix(matrix));
    }

    @Test
    void shouldReturnNullForMatrixIsEmptyAtGetReversedMatrix() {
        int[][] matrix = new int[][] {{}};
        assertNull(Bloco4Ex18.getReversedMatrix(matrix));
    }

    @Test
    void shouldReturnTransposedMatrix() {
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertArrayEquals(new int[][] {
                {1, 4},
                {2, 5},
                {3, 6}
        }, Bloco4Ex18.getTransposedMatrix(matrix));
    }

    @Test
    void shouldReturnNullForMatrixIsEmptyAtGetTransposedMatrix() {
        int[][] matrix = new int[][] {{}};
        assertNull(Bloco4Ex18.getTransposedMatrix(matrix));
    }
}