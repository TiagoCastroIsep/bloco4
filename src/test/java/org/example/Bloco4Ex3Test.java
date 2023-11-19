package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex3Test {
    static final Bloco4Ex3 bloco4Ex3 = new Bloco4Ex3();
    @Test
    public void shouldReturnCorrectSum() {
        int number = 123;
        int expected = 6;
        assertEquals(expected, bloco4Ex3.sumOfArrayElements(number));
    }

    @Test
    public void shouldReturnCorrectValueForSingleDigitNumber() {
        int number = 0;
        int expected = 0;
        assertEquals(expected, bloco4Ex3.sumOfArrayElements(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberLessThanZero() {
        int number = -1;
        int expected = -1;
        assertEquals(expected, bloco4Ex3.sumOfArrayElements(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberMoreThanMaxLimit() {
        int number = 1000000001;
        int expected = -1;
        assertEquals(expected, bloco4Ex3.sumOfArrayElements(number));
    }
}