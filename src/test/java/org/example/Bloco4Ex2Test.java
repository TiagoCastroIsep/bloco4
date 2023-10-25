package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex2Test {
    @Test
    public void shouldReturnCorrectArray() {
        int number = 123;
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, Bloco4Ex2.extractArrayOfDigitsFromIntNumber(number));
    }

    @Test
    public void shouldReturnCorrectValueForSingleDigitNumber() {
        int number = 0;
        int[] expected = {0};
        assertArrayEquals(expected, Bloco4Ex2.extractArrayOfDigitsFromIntNumber(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberLessThanZero() {
        int number = -1;
        assertNull(Bloco4Ex2.extractArrayOfDigitsFromIntNumber(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberMoreThanMaxLimit() {
        int number = 1000000001;
        assertNull(Bloco4Ex2.extractArrayOfDigitsFromIntNumber(number));
    }
}