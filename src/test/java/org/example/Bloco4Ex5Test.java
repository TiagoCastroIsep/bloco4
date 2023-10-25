package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex5Test {
    @Test
    public void shouldReturnReducedArrayOfNotPairs() {
        int[] number = {3, 6, 7, 8, 1};
        int[] expected = {3, 7, 1};
        assertArrayEquals(expected, Bloco4Ex5.getNotPairsArrayFromArrayOfInts(number));
    }
}