package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex20Test {
    static final Bloco4Ex20 bloco4Ex20 = new Bloco4Ex20();
    @Test
    void shouldReturnProductOfAMatrixForOneConstant() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int constant = 2;
        int[][] expected = {{2, 4, 6}, {8, 10, 12}, {14, 16, 18}};
        assertArrayEquals(expected, bloco4Ex20.getProductOfAMatrixForOneConstant(matrix, constant));
    }

    @Test
    void shouldReturnSumOfTwoMatrices() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{2, 4, 6}, {8, 10, 12}, {14, 16, 18}};
        assertArrayEquals(expected, bloco4Ex20.getSumOfTwoMatrices(matrix1, matrix2));
    }

    @Test
    void shouldReturnProductOfTwoMatrices() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{30, 36, 42}, {66, 81, 96}, {102, 126, 150}};
        assertArrayEquals(expected, bloco4Ex20.getProductOfTwoMatrices(matrix1, matrix2));
    }

    @Test
    void shouldReturnNullWhenConstantIsZero() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int constant = 0;
        assertNull(bloco4Ex20.getProductOfAMatrixForOneConstant(matrix, constant));
    }

    @Test
    void shouldReturnNullWhenMatrixLengthIsZero() {
        int[][] matrix = {};
        int constant = 2;
        assertNull(bloco4Ex20.getProductOfAMatrixForOneConstant(matrix, constant));
    }

    @Test
    void shouldReturnNullWhenMatricesSizeAreNotEquals() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertNull(bloco4Ex20.getSumOfTwoMatrices(matrix1, matrix2));
    }
}