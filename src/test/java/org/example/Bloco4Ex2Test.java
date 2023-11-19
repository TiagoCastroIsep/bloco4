package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex2Test {
    static final Bloco4Ex2 bloco4Ex2 = new Bloco4Ex2();
    @Test
    public void shouldReturnCorrectArray() {
        int number = 123;
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, bloco4Ex2.extractArrayOfDigitsFromIntNumber(number));
    }

    @Test
    public void shouldReturnCorrectValueForSingleDigitNumber() {
        int number = 0;
        int[] expected = {0};
        assertArrayEquals(expected, bloco4Ex2.extractArrayOfDigitsFromIntNumber(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberLessThanZero() {
        int number = -1;
        assertNull(bloco4Ex2.extractArrayOfDigitsFromIntNumber(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberMoreThanMaxLimit() {
        int number = 1000000001;
        assertNull(bloco4Ex2.extractArrayOfDigitsFromIntNumber(number));
    }
}