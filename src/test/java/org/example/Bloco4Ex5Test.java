package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex5Test {
    static final Bloco4Ex5 bloco4Ex5 = new Bloco4Ex5();
    @Test
    public void shouldReturnReducedArrayOfNotPairs() {
        int[] number = {3, 6, 7, 8, 1};
        int[] expected = {3, 7, 1};
        assertArrayEquals(expected, bloco4Ex5.getNotPairsArrayFromArrayOfInts(number));
    }
}