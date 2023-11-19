package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex15Test {
    static final Bloco4Ex15 bloco4Ex15 = new Bloco4Ex15();
    @Test
    public void shouldReturnFalseForEmptyMatrix_checkIfMatrixEveryMatrixLineHasTheSameNumberOfColumns() {
        int[][] matrix = new int[0][0];

        assertFalse(bloco4Ex15.checkMatrixLinesHasTheSameNumberOfColumns(matrix));
    }

    @Test
    public void shouldReturnFalseForMatrixWithDifferentNumberOfColumns_checkIfMatrixEveryMatrixLineHasTheSameNumberOfColumns() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2},
                {1, 2, 3, 4}
        };

        assertFalse(bloco4Ex15.checkMatrixLinesHasTheSameNumberOfColumns(matrix));
    }

    @Test
    public void shouldReturnTrueForMatrixWithDifferentNumberOfColumns_checkIfMatrixEveryMatrixLineHasTheSameNumberOfColumns() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        assertTrue(bloco4Ex15.checkMatrixLinesHasTheSameNumberOfColumns(matrix));
    }

    @Test
    public void shouldReturnNumberOfColumnsInMatrix_getNumberOfColumnsInMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        int expected = 3;
        assertEquals(expected, bloco4Ex15.getNumberOfColumnsInMatrix(matrix));
    }

    @Test
    public void shouldReturnMinus1ForEmptyMatrix_getNumberOfColumnsInMatrix() {
        int[][] matrix = new int[0][0];

        int expected = -1;
        assertEquals(expected, bloco4Ex15.getNumberOfColumnsInMatrix(matrix));
    }
}