package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex17Test {
    static final Bloco4Ex17 bloco4Ex17 = new Bloco4Ex17();
    @Test
    public void shouldReturnFalseForEmptyMatrix() {
        int[][] matrix = new int[0][0];
        assertFalse(bloco4Ex17.checkIfMatrixIsRectangular(matrix));
    }

    @Test
    public void shouldReturnTrueForSquareMatrix() {
        int[][] matrix = {
                {1, 2},
                {1, 2}
        };
        assertTrue(bloco4Ex17.checkIfMatrixIsRectangular(matrix));
    }

    @Test
    public void shouldReturnFalseForMatrixWithDifferentNumberOfColumns() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2},
                {1, 2, 3, 4}
        };

        assertFalse(bloco4Ex17.checkIfMatrixIsRectangular(matrix));
    }

    @Test
    public void shouldReturnTrueForMatrixIsRectangle() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3}
        };
        assertFalse(bloco4Ex17.checkIfMatrixIsRectangular(matrix));
    }
}