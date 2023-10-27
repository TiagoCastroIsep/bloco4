package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex16Test {
    @Test
    public void shouldReturnFalseForEmptyMatrix_checkIfMatrixIsSquare() {
        int[][] matrix = new int[0][0];
        assertFalse(Bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }

    @Test
    public void shouldReturnFalseForNonSquareMatrix_checkIfMatrixIsSquare() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3}
        };
        assertFalse(Bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }

    @Test
    public void shouldReturnFalseForMatrixOfLengthEqualsZero_checkIfMatrixIsSquare() {
        int[][] matrix = {
                {}
        };
        assertFalse(Bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }

    @Test
    public void shouldReturnTrueForSquareMatrix_checkIfMatrixIsSquare() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        assertTrue(Bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }

    @Test
    public void shouldReturnTrueForSquareMatrixWithOneElement_checkIfMatrixIsSquare() {
        int[][] matrix = {
                {1}
        };
        assertTrue(Bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }

    @Test
    public void shouldReturnTrueForSquareMatrixWithTwoElements_checkIfMatrixIsSquare() {
        int[][] matrix = {
                {1, 2},
                {1, 2}
        };
        assertTrue(Bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }
}