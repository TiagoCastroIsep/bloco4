package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex1Test {
    @Test
    public void shouldReturnCorrectValue() {
        int number = 123;
        int expected = 3;
        assertEquals(expected, Bloco4Ex1.getNumberOfDigitsOfPositiveInt(number));
    }

    @Test
    public void shouldReturnCorrectValueForSingleDigitNumber() {
        int number = 0;
        int expected = 1;
        assertEquals(expected, Bloco4Ex1.getNumberOfDigitsOfPositiveInt(number));
    }

    @Test
    public void shouldReturnCorrectValueForSingleDigitNumberWhenNumberIs1() {
        int number = 1;
        int expected = 1;
        assertEquals(expected, Bloco4Ex1.getNumberOfDigitsOfPositiveInt(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberLessThanZero() {
        int number = -1;
        int expected = -1;
        assertEquals(expected, Bloco4Ex1.getNumberOfDigitsOfPositiveInt(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberMoreThanMaxLimit() {
        int number = 1000000001;
        int expected = -1;
        assertEquals(expected, Bloco4Ex1.getNumberOfDigitsOfPositiveInt(number));
    }
}