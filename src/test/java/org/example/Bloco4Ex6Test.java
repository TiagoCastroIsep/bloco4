package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex6Test {
    static final Bloco4Ex6 bloco4Ex6 = new Bloco4Ex6();
    @Test
    public void shouldReturnCorrectValue() {
        int number = 1234;
        int expected = 6;
        assertEquals(expected, bloco4Ex6.sumOfAllPairsInNumberIntPositive(number));
    }

    @Test
    public void shouldReturnCorrectValueForNumberEquals0() {
        int number = 0;
        int expected = 0;
        assertEquals(expected, bloco4Ex6.sumOfAllPairsInNumberIntPositive(number));
    }

    @Test
    public void shouldReturnCorrectValueForNumberEquals1() {
        int number = 1;
        int expected = 0;
        assertEquals(expected, bloco4Ex6.sumOfAllPairsInNumberIntPositive(number));
    }

    @Test
    public void shouldReturnCorrectValueForNumberEquals2() {
        int number = 2;
        int expected = 2;
        assertEquals(expected, bloco4Ex6.sumOfAllPairsInNumberIntPositive(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberLessThanZero() {
        int number = -1;
        int expected = -1;
        assertEquals(expected, bloco4Ex6.sumOfAllPairsInNumberIntPositive(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberOverMaxLimit() {
        int number = 1000000001;
        int expected = -1;
        assertEquals(expected, bloco4Ex6.sumOfAllPairsInNumberIntPositive(number));
    }
}