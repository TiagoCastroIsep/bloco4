package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex8Test {
    @Test
    public void shouldReturnTheCorrectElements() {
        int n = 4;
        int[] array = {3, 4, 6, 8, 1, 23, 89, 12};
        int[] expected = {3, 4, 6, 8};
        assertArrayEquals(expected, Bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnCorrectValueForElementInArrayEqualsZero() {
        int n = 4;
        int[] array = {3, 4, 0, 8, 1, 23, 89, 12};
        int[] expected = {3, 4, 0, 8};
        assertArrayEquals(expected, Bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnNullForNLessThanZero() {
        int n = -1;
        int[] array = {3, 4, 6, 8, 1, 23, 89, 12};
        assertNull(Bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnNullForNBiggerThanInputArrayLength() {
        int n = 10;
        int[] array = {3, 4, 6, 8, 1, 23, 89, 12};
        assertNull(Bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnNullForElementInArrayLessThanZero() {
        int n = 5;
        int[] array = {3, 4, -1, 8, 1, 23, 89, 12};
        assertNull(Bloco4Ex8.getTheFirstNElements(n, array));
    }
}