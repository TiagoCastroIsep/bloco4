package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex8Test {
    static final Bloco4Ex8 bloco4Ex8 = new Bloco4Ex8();
    @Test
    public void shouldReturnCorrectResultForTotalElementsInArray() {
        int n = 3;
        int[] array = {3, 4, 1};
        assertArrayEquals(array, bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnCorrectResultForArrayWithOneElement() {
        int n = 1;
        int[] array = {3};
        assertArrayEquals(array, bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnTheCorrectElements() {
        int n = 4;
        int[] array = {3, 4, 6, 8, 1, 23, 89, 12};
        int[] expected = {3, 4, 6, 8};
        assertArrayEquals(expected, bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnCorrectValueForElementInArrayEqualsZero() {
        int n = 4;
        int[] array = {3, 4, 0, 8, 1, 23, 89, 12};
        int[] expected = {3, 4, 0, 8};
        assertArrayEquals(expected, bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnNullForNLessThanZero() {
        int n = -1;
        int[] array = {3, 4, 6, 8, 1, 23, 89, 12};
        assertNull(bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnNullForNEqualsZero() {
        int n = 0;
        int[] array = {3, 4, 6, 8, 1, 23, 89, 12};
        assertNull(bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnNullForNBiggerThanInputArrayLength() {
        int n = 4;
        int[] array = {3, 4, 6};
        assertNull(bloco4Ex8.getTheFirstNElements(n, array));
    }

    @Test
    public void shouldReturnNullForEmptyArray() {
        int n = 1;
        int[] array = {};
        assertNull(bloco4Ex8.getTheFirstNElements(n, array));
    }
}