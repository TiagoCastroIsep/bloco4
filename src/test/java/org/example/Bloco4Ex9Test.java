package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex9Test {
    static final Bloco4Ex9 bloco4Ex9 = new Bloco4Ex9();
    @Test
    public void shouldReturnMultiplesOfNInInterval() {
        int n = 3;
        int minLimit = 0;
        int maxLimit = 10;
        int[] expected = {0, 3, 6, 9};
        assertArrayEquals(expected, bloco4Ex9.getMultiplesOfNEquals3(n, minLimit, maxLimit));
    }

    @Test
    public void shouldReturnMultiplesOfNInIntervalSwappedLimits() {
        int n = 3;
        int minLimit = 10;
        int maxLimit = 0;
        int[] expected = {0, 3, 6, 9};
        assertArrayEquals(expected, bloco4Ex9.getMultiplesOfNEquals3(n, minLimit, maxLimit));
    }

    @Test
    public void shouldNullForNegativeMinLimit() {
        int n = 3;
        int minLimit = -1;
        int maxLimit = 10;
        assertNull(bloco4Ex9.getMultiplesOfNEquals3(n, minLimit, maxLimit));
    }

    @Test
    public void shouldReturnNullForNegativeMinLimit() {
        int n = 3;
        int minLimit = -1;
        int maxLimit = 10;
        assertNull(bloco4Ex9.getMultiplesOfNEquals3(n, minLimit, maxLimit));
    }
}