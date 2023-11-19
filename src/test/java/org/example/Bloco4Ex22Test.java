package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex22Test {
    static final Bloco4Ex22 bloco4Ex22 = new Bloco4Ex22();
    @Test
    void shouldReturnMaskMatrixWithFreeSlotsForNumbers() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int[][] expected = {
                {0, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 1, 0, 0, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 0, 1, 0, 1, 0},
                {1, 0, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 0, 0, 0, 1, 1},
                {0, 1, 1, 0, 1, 1, 1, 0, 1},
                {0, 1, 0, 1, 1, 1, 1, 0, 0},
                {1, 1, 0, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 0, 1, 1}
        };
        assertArrayEquals(expected, bloco4Ex22.getFreeSlotsMaskMatrix(gameMatrix));
    }

    @Test
    void shouldReturnNullForEmptyGameMatrix() {
        int[][] gameMatrix = {};
        assertNull(bloco4Ex22.getFreeSlotsMaskMatrix(gameMatrix));
    }

    @Test
    void shouldReturnNullForNotSquareGameMatrix() {
        int[][] gameMatrix = {{1, 1}};
        assertNull(bloco4Ex22.getFreeSlotsMaskMatrix(gameMatrix));
    }

    @Test
    void shouldReturnCorrectArrayOfNumbersAvailableInRow() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int row = 1;
        int[] expected = {9, 4, 8, 2, 1, 7, 5};
        assertArrayEquals(expected, bloco4Ex22.getAlreadyFilledSlotsArray(gameMatrix, row, true));
    }

    @Test
    void shouldReturnCorrectArrayOfNumbersAvailableInColumn() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int column = 0;
        int[] expected = {9, 6, 1, 3, 4, 7};
        assertArrayEquals(expected, bloco4Ex22.getAlreadyFilledSlotsArray(gameMatrix, column, false));
    }

    @Test
    void shouldReturnCorrectPlayerChoicesForSlotSelected() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 0;
        int columnSelected = 0;
        int[][] expected = {
                {4, 8},
                {2, 5, 8}
        };
        assertArrayEquals(expected, bloco4Ex22.getPlayerChoicesForGivenSelection(gameMatrix, rowSelected, columnSelected));
    }

    @Test
    void shouldReturnNullForAlreadyFilledSlot() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 0;
        int columnSelected = 1;
        assertNull(bloco4Ex22.getPlayerChoicesForGivenSelection(gameMatrix, rowSelected, columnSelected));
    }

    @Test
    void shouldReturnTrueForValidateUserSelection() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 0;
        int columnSelected = 0;
        int numberSelected = 8; //4 and 8 are possible according to row lookup.
        assertTrue(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldReturnTrueForValidateUserSelection2() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 0;
        int columnSelected = 7;
        int numberSelected = 4; //4 and 8 are possible according to row lookup.
        assertTrue(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldReturnTrueForValidateUserSelection3() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4}, //this row
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 5;
        int columnSelected = 0;
        int numberSelected = 2;
        assertTrue(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldReturnTrueForValidateUserSelection5() {
        int[][] gameMatrix = {
                {8, 1, 2, 7, 5, 3, 6, 4, 9},
                {9, 4, 3, 6, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 3},
                {1, 7, 4, 2, 3, 5, 8, 9, 6},
                {3, 6, 9, 8, 0, 7, 0, 2, 1},
                {2, 8, 7, 1, 6, 9, 5, 3, 4},
                {5, 2, 1, 9, 7, 4, 3, 6, 8},
                {4, 3, 8, 5, 2, 6, 9, 1, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 8;
        int columnSelected = 5;
        int numberSelected = 8;
        assertTrue(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldReturnTrueForValidateUserSelection6() {
        int[][] gameMatrix = {
                {8, 1, 2, 7, 5, 3, 6, 4, 9},
                {9, 4, 3, 6, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 7, 8, 3},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {2, 8, 7, 1, 6, 9, 5, 3, 4},
                {5, 2, 1, 9, 7, 4, 3, 6, 8},
                {4, 3, 8, 5, 2, 6, 9, 1, 7},
                {7, 9, 6, 3, 1, 8, 4, 5, 2}
        };
        int rowSelected = 3;
        int columnSelected = 5;
        int numberSelected = 7;
        assertTrue(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldReturnTrueForValidateUserSelection4() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4}, //this row
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 5;
        int columnSelected = 7;
        int numberSelected = 3;
        assertTrue(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldReturnFalseForRowValueLessThanZero() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = -1;
        int columnSelected = 5;
        int numberSelected = 5;
        assertFalse(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldReturnFalseForColumnValueLessThanZero() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 0;
        int columnSelected = -1;
        int numberSelected = 5;
        assertFalse(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldReturnFalseForRowValueMoreThan8() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 9;
        int columnSelected = 5;
        int numberSelected = 5;
        assertFalse(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldReturnFalseForColumnValueMoreThan8() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 0;
        int columnSelected = 9;
        int numberSelected = 5;
        assertFalse(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }


    @Test
    void shouldReturnFalseForOccupiedSlotOnValidateUserSelection() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9}, //this row
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 0;
        int columnSelected = 5;
        int numberSelected = 5;
        assertFalse(bloco4Ex22.validateUserSelection(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldUpdateTheGameMatrix() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        int rowSelected = 0;
        int columnSelected = 0;
        int numberSelected = 8; //4 and 8 are possible according to row lookup.
        int[][] expected = {
                {8, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        assertArrayEquals(expected, bloco4Ex22.updateGameMatrix(gameMatrix, rowSelected, columnSelected, numberSelected));
    }

    @Test
    void shouldReturnTrueForGameOver() {
        int[][] gameMatrix = new int[9][9];
        for (int i = 0; i < gameMatrix.length; i++) {
            for (int j = 0; j < gameMatrix.length; j++) {
                gameMatrix[i][j] = 1;
            }
        }
        assertTrue(bloco4Ex22.checkGameOver(gameMatrix));
    }

    @Test
    void shouldReturnFalseForGameOver() {
        int[][] gameMatrix = {
                {0, 1, 2, 7, 5, 3, 6, 0, 9},
                {9, 4, 0, 0, 8, 2, 1, 7, 5},
                {6, 0, 5, 4, 0, 1, 0, 8, 0},
                {1, 0, 4, 2, 3, 0, 8, 9, 6},
                {3, 6, 9, 8, 0, 0, 0, 2, 1},
                {0, 8, 7, 0, 6, 9, 5, 0, 4},
                {0, 2, 0, 9, 7, 4, 3, 0, 0},
                {4, 3, 0, 0, 2, 6, 9, 0, 7},
                {7, 0, 6, 3, 1, 0, 0, 5, 2}
        };
        assertFalse(bloco4Ex22.checkGameOver(gameMatrix));
    }
}