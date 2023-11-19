package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex16Test {
    static final Bloco4Ex16 bloco4Ex16 = new Bloco4Ex16();
    @Test
    public void shouldReturnFalseForEmptyMatrix_checkIfMatrixIsSquare() {
        int[][] matrix = new int[0][0];
        assertFalse(bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }

    @Test
    public void shouldReturnFalseForNonSquareMatrix_checkIfMatrixIsSquare() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3}
        };
        assertFalse(bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }

    @Test
    public void shouldReturnFalseForMatrixOfLengthEqualsZero_checkIfMatrixIsSquare() {
        int[][] matrix = {
                {}
        };
        assertFalse(bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }

    @Test
    public void shouldReturnTrueForSquareMatrix_checkIfMatrixIsSquare() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        assertTrue(bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }

    @Test
    public void shouldReturnTrueForSquareMatrixWithOneElement_checkIfMatrixIsSquare() {
        int[][] matrix = {
                {1}
        };
        assertTrue(bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }

    @Test
    public void shouldReturnTrueForSquareMatrixWithTwoElements_checkIfMatrixIsSquare() {
        int[][] matrix = {
                {1, 2},
                {1, 2}
        };
        assertTrue(bloco4Ex16.checkIfMatrixIsSquare(matrix));
    }
}