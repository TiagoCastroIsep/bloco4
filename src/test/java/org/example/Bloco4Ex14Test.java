package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex14Test {
    @Test
    public void shouldReturnMinusOneIfEitherArrayIsEmpty() {
        int[] array1 = {};
        int[] array2 = {1, 2, 3};

        assertEquals(-1, Bloco4Ex14.getDotProductOfTwoArrays(array1, array2));
    }

    @Test
    public void shouldReturnMinusOneIfArraysHaveDifferentLengths() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};

        assertEquals(-1, Bloco4Ex14.getDotProductOfTwoArrays(array1, array2));
    }

    @Test
    public void shouldReturnDotProductOfTwoArrays() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        assertEquals(14, Bloco4Ex14.getDotProductOfTwoArrays(array1, array2));
    }
}