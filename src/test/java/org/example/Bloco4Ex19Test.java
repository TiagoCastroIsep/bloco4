package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex19Test {
    static final Bloco4Ex19 bloco4Ex19 = new Bloco4Ex19();
    @Test
    void shouldReturnMatrixDeterminantWithLaplaceTheorem() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expected = 0;
        assertEquals(expected, bloco4Ex19.getMatrixDeterminantWithLaplaceTheorem(matrix));
    }

    @Test
    void shouldReturnMatrixDeterminantWithLaplaceTheorem2() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int expected = -1; // error due to rectangular matrix
        assertEquals(expected, bloco4Ex19.getMatrixDeterminantWithLaplaceTheorem(matrix));
    }

    @Test
    void shouldReturnMatrixDeterminantWithLaplaceTheorem_2x2Matrix() {
        int[][] matrix = {
                {1, 2},
                {4, 5}
        };
        int expected = -3;
        assertEquals(expected, bloco4Ex19.getMatrixDeterminantWithLaplaceTheorem(matrix));
    }

    @Test
    void shouldReturnSubMatrix() {
        int i = 0;
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {5, 6},
                {8, 9}
        };
        assertArrayEquals(expected, bloco4Ex19.getSubMatrix(matrix, i));
    }

    @Test
    void shouldReturnDeterminant() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expected = 0;
        assertEquals(expected, bloco4Ex19.getDeterminantOfNxNMatrix(matrix));
    }

    @Test
    void shouldReturnDeterminant2() {
        int[][] matrix = {
                {5, 2, 3},
                {4, 5, 6},
                {7, 8, 5}
        };
        int expected = -80;
        assertEquals(expected, bloco4Ex19.getDeterminantOfNxNMatrix(matrix));
    }

    @Test
    void shouldReturnDeterminant3() {
        int[][] matrix = {
                {1, 2, 5},
                {4, 1, 6},
                {5, 8, 1}
        };
        int expected = 140;
        assertEquals(expected, bloco4Ex19.getDeterminantOfNxNMatrix(matrix));
    }

    @Test
    void shouldReturnDeterminant4() {
        int[][] matrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int expected = 0;
        assertEquals(expected, bloco4Ex19.getDeterminantOfNxNMatrix(matrix));
    }

    @Test
    void shouldReturnDeterminant5() {
        int[][] matrix = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        int expected = 0;
        assertEquals(expected, bloco4Ex19.getDeterminantOfNxNMatrix(matrix));
    }

    @Test
    void shouldReturnDeterminant6() {
        int[][] matrix = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        int expected = 0;
        assertEquals(expected, bloco4Ex19.getDeterminantOfNxNMatrix(matrix));
    }

    @Test
    void shouldReturnDeterminant7() {
        int[][] matrix = {
                {1, -1, -1},
                {-1, 1, -1},
                {-1, -1, 1}
        };
        int expected = -4;
        assertEquals(expected, bloco4Ex19.getDeterminantOfNxNMatrix(matrix));
    }
}