package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex4Test {
    @Test
    public void shouldReturnReducedArrayOfPairs() {
        int[] number = {3, 6, 7, 8, 1};
        int[] expected = {6, 8};
        assertArrayEquals(expected, Bloco4Ex4.getPairsArrayFromArrayOfInts(number));
    }
}