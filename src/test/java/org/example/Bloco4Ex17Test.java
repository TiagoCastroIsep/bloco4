package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex17Test {
    @Test
    public void shouldReturnFalseForEmptyMatrix() {
        int[][] matrix = new int[0][0];
        assertFalse(Bloco4Ex17.checkIfMatrixIsRectangular(matrix));
    }

    @Test
    public void shouldReturnTrueForSquareMatrix() {
        int[][] matrix = {
                {1, 2},
                {1, 2}
        };
        assertTrue(Bloco4Ex17.checkIfMatrixIsRectangular(matrix));
    }

    @Test
    public void shouldReturnFalseForMatrixWithDifferentNumberOfColumns() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2},
                {1, 2, 3, 4}
        };

        assertFalse(Bloco4Ex17.checkIfMatrixIsRectangular(matrix));
    }

    @Test
    public void shouldReturnTrueForMatrixIsRectangle() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3}
        };
        assertFalse(Bloco4Ex17.checkIfMatrixIsRectangular(matrix));
    }
}