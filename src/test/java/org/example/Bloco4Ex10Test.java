package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex10Test {
    @Test
    public void shouldReturnMultiplesOfNInInterval() {
        int n = 3;
        int minLimit = 0;
        int maxLimit = 10;
        int[] expected = {0, 3, 6, 9};
        assertArrayEquals(expected, Bloco4Ex10.getMultiplesOfN(n, minLimit, maxLimit));
    }

    @Test
    public void shouldReturnMultiplesOfNInIntervalSwappedLimits() {
        int n = 3;
        int minLimit = 10;
        int maxLimit = 0;
        int[] expected = {0, 3, 6, 9};
        assertArrayEquals(expected, Bloco4Ex10.getMultiplesOfN(n, minLimit, maxLimit));
    }

    @Test
    public void shouldNullForNegativeMinLimit() {
        int n = 3;
        int minLimit = -1;
        int maxLimit = 10;
        assertNull(Bloco4Ex10.getMultiplesOfN(n, minLimit, maxLimit));
    }

    @Test
    public void shouldReturnNullForNegativeMinLimit() {
        int n = 3;
        int minLimit = -1;
        int maxLimit = 10;
        assertNull(Bloco4Ex10.getMultiplesOfN(n, minLimit, maxLimit));
    }
}