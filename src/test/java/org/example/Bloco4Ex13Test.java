package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex13Test {
    @Test
    public void shouldReturnMinValueInIntArray_getMinValueFromArray() {
        int[] numbers = {2, 3, 1, 10, 8};
        boolean minValue = true;
        int expected = 1;
        assertEquals(expected, Bloco4Ex13.getMinOrMaxValueFromArray(numbers, minValue));
    }

    @Test
    public void shouldReturnMinus1ForEmptyArray_getMinValueFromArray() {
        int[] numbers = new int[0];
        boolean minValue = true;
        int expected = -1;
        assertEquals(expected, Bloco4Ex13.getMinOrMaxValueFromArray(numbers, minValue));
    }

    @Test
    public void shouldReturn2ForAllElementsEquals2_getMinValueFromArray() {
        int[] numbers = {2, 2, 2};
        boolean minValue = true;
        int expected = 2;
        assertEquals(expected, Bloco4Ex13.getMinOrMaxValueFromArray(numbers, minValue));
    }

    // maxValue
    @Test
    public void shouldReturnMinValueInIntArray_getMaxValueFromArray() {
        int[] numbers = {2, 3, 1, 10, 8};
        boolean minValue = false;
        int expected = 1;
        assertEquals(expected, Bloco4Ex13.getMinOrMaxValueFromArray(numbers, minValue));
    }

    @Test
    public void shouldReturnMinus1ForEmptyArray_getMaxValueFromArray() {
        int[] numbers = new int[0];
        boolean minValue = false;
        int expected = -1;
        assertEquals(expected, Bloco4Ex13.getMinOrMaxValueFromArray(numbers, minValue));
    }

    @Test
    public void shouldReturn2ForAllElementsEquals2_getMaxValueFromArray() {
        int[] numbers = {2, 2, 2};
        boolean minValue = false;
        int expected = 2;
        assertEquals(expected, Bloco4Ex13.getMinOrMaxValueFromArray(numbers, minValue));
    }
}