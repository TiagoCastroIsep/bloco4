package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Bloco4Ex15Test {
    @Test
    public void shouldReturnFalseForEmptyMatrix_checkIfMatrixEveryMatrixLineHasTheSameNumberOfColumns() {
        int[][] matrix = new int[0][0];

        assertFalse(Bloco4Ex15.checkIfMatrixEveryMatrixLineHasTheSameNumberOfColumns(matrix));
    }

    @Test
    public void shouldReturnFalseForMatrixWithDifferentNumberOfColumns_checkIfMatrixEveryMatrixLineHasTheSameNumberOfColumns() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2},
                {1, 2, 3, 4}
        };

        assertFalse(Bloco4Ex15.checkIfMatrixEveryMatrixLineHasTheSameNumberOfColumns(matrix));
    }

    @Test
    public void shouldReturnNumberOfColumnsInMatrix_getNumberOfColumnsInMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };

        int expected = 3;
        assertEquals(expected, Bloco4Ex15.getNumberOfColumnsInMatrix(matrix));
    }

    @Test
    public void shouldReturnMinus1ForEmptyMatrix_getNumberOfColumnsInMatrix() {
        int[][] matrix = new int[0][0];

        int expected = -1;
        assertEquals(expected, Bloco4Ex15.getNumberOfColumnsInMatrix(matrix));
    }
}