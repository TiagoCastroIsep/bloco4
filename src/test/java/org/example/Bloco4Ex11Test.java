package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex11Test {
    @Test
    public void shouldReturnCommonMultiplesInInterval() {
        int a = 4;
        int b = 12;
        int[] multiplesOf = {2, 3};
        int[] expected = {6, 12};
        assertArrayEquals(expected, Bloco4Ex11.getCommonMultiplesOfNumbersInRange(a, b, multiplesOf));
    }

    // TODO: implementar condição
    @Test
    public void shouldReturnCommonMultiplesInIntervalOneOfTheMultiplesIsZero() {
        int a = 1;
        int b = 12;
        int[] multiplesOf = {0, 3};
        int[] expected = {3, 6, 9, 12};
        assertArrayEquals(expected, Bloco4Ex11.getCommonMultiplesOfNumbersInRange(a, b, multiplesOf));
    }

    @Test
    public void shouldReturnCommonMultiplesInIntervalMinLimitIsZero() {
        int a = 0;
        int b = 12;
        int[] multiplesOf = {2, 3};
        int[] expected = {0, 6, 12}; // zero é multiplo de ambos;
        assertArrayEquals(expected, Bloco4Ex11.getCommonMultiplesOfNumbersInRange(a, b, multiplesOf));
    }

    @Test
    public void shouldReturnCommonMultiplesInIntervalBiggerInterval() {
        int a = 4;
        int b = 12;
        int[] multiplesOf = {2, 3, 4};
        int[] expected = {12};
        assertArrayEquals(expected, Bloco4Ex11.getCommonMultiplesOfNumbersInRange(a, b, multiplesOf));
    }

    @Test
    public void shouldReturnNullForMinLimitLessThanZero() {
        int a = -1;
        int b = 12;
        int[] multiplesOf = {2, 3};
        assertNull(Bloco4Ex11.getCommonMultiplesOfNumbersInRange(a, b, multiplesOf));
    }

    @Test
    public void shouldReturnNullForEmptyMultiplesArray() {
        int a = 0;
        int b = 12;
        int[] multiplesOf = new int[0];
        assertNull(Bloco4Ex11.getCommonMultiplesOfNumbersInRange(a, b, multiplesOf));
    }
}