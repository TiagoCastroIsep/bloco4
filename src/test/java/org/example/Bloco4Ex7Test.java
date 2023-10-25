package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex7Test {
    @Test
    public void shouldReturnCorrectValue() {
        int number = 1234;
        int expected = 4;
        assertEquals(expected, Bloco4Ex7.sumOfAllNotPairsInNumberIntPositive(number));
    }

    @Test
    public void shouldReturnCorrectValueForNumberEquals0() {
        int number = 0;
        int expected = 0;
        assertEquals(expected, Bloco4Ex7.sumOfAllNotPairsInNumberIntPositive(number));
    }

    @Test
    public void shouldReturnCorrectValueForNumberEquals1() {
        int number = 1;
        int expected = 1;
        assertEquals(expected, Bloco4Ex7.sumOfAllNotPairsInNumberIntPositive(number));
    }

    @Test
    public void shouldReturnCorrectValueForNumberEquals2() {
        int number = 2;
        int expected = 0;
        assertEquals(expected, Bloco4Ex7.sumOfAllNotPairsInNumberIntPositive(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberLessThanZero() {
        int number = -1;
        int expected = -1;
        assertEquals(expected, Bloco4Ex7.sumOfAllNotPairsInNumberIntPositive(number));
    }

    @Test
    public void shouldReturnMinus1ForNumberOverMaxLimit() {
        int number = 1000000001;
        int expected = -1;
        assertEquals(expected, Bloco4Ex7.sumOfAllNotPairsInNumberIntPositive(number));
    }
}