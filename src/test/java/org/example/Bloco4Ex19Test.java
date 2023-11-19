package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex19Test {
    static final Bloco4Ex19 bloco4Ex19 = new Bloco4Ex19();
    @Test
    void shouldReturnMatrixDeterminantWithLaplaceTheorem() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int expected = 0;
        assertEquals(expected, bloco4Ex19.getMatrixDeterminantWithLaplaceTheorem(matrix));
    }

    @Test
    void shouldReturnMatrixDeterminantWithLaplaceTheorem2() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int expected = -1; // should throw error instead
        assertEquals(expected, bloco4Ex19.getMatrixDeterminantWithLaplaceTheorem(matrix));
    }
}