package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4UtilsTest {
    @Test
    public void shouldReturnCorrectNumberOfDigits_getNumberOfDigits() {
        int number = 123;
        int expected = 3;
        assertEquals(expected, Bloco4Utils.getNumberOfDigits(number));
    }

    @Test
    public void shouldReturnCorrectNumberOfDigitsForNumberZero_getNumberOfDigits() {
        int number = 0;
        int expected = 1;
        assertEquals(expected, Bloco4Utils.getNumberOfDigits(number));
    }

    @Test
    public void shouldReturnMinus1forNumberLessThanZero_getNumberOfDigits() {
        int number = -1;
        int expected = -1;
        assertEquals(expected, Bloco4Utils.getNumberOfDigits(number));
    }

    @Test
    public void shouldReturnMinus1forNumberBiggerThanLimit_getNumberOfDigits() {
        // max number before overflow
        int number = 1000000001;
        int expected = -1;
        assertEquals(expected, Bloco4Utils.getNumberOfDigits(number));
    }

    @Test
    public void shouldReturnArrayFromNumber_getArrayFromIntNumber() {
        int number = 123;
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, Bloco4Utils.getArrayFromIntNumber(number));
    }

    @Test
    public void shouldReturnArrayWithOneZeroFromNumberZero_getArrayFromIntNumber() {
        int number = 0;
        int[] expected = {0};
        assertArrayEquals(expected, Bloco4Utils.getArrayFromIntNumber(number));
    }

    @Test
    public void shouldReturnNullForNumberLessThanZero_getArrayFromIntNumber() {
        int number = -1;
        assertNull(Bloco4Utils.getArrayFromIntNumber(number));
    }

    @Test
    public void shouldReturnNullForNumberBiggerThanIntMaxLimit_getArrayFromIntNumber() {
        int number = 1000000001;
        assertNull(Bloco4Utils.getArrayFromIntNumber(number));
    }

    @Test
    public void shouldReturnCorrectSum_sumOfArrayElements() {
        int[] digitsArray = {1, 2, 3};
        int expected = 6;
        assertEquals(expected, Bloco4Utils.sumOfArrayElementsFromIntArrayInput(digitsArray));
    }

    @Test
    public void shouldReturnCorrectValueForSingleDigitNumber_sumOfArrayElements() {
        int[] digitsArray = {0};
        int expected = 0;
        assertEquals(expected, Bloco4Utils.sumOfArrayElementsFromIntArrayInput(digitsArray));
    }

    @Test
    public void shouldReturnMinus1ForNumberLessThanZero_sumOfArrayElements() {
        int[] digitsArray = {-1};
        int expected = -1;
        assertEquals(expected, Bloco4Utils.sumOfArrayElementsFromIntArrayInput(digitsArray));
    }

    @Test
    public void shouldReturnReducedArrayOfPairs() {
        int[] number = {3, 6, 7, 8, 1};
        int[] expected = {6, 8};
        assertArrayEquals(expected, Bloco4Utils.reducedArrayOfPairsOrNotPairs(number, true));
    }

    @Test
    public void shouldReturnReducedArrayOfNotPairs() {
        int[] number = {3, 6, 7, 8, 1};
        int[] expected = {3, 7, 1};
        assertArrayEquals(expected, Bloco4Utils.reducedArrayOfPairsOrNotPairs(number, false));
    }

    @Test
    public void shouldReturnCorrectedLimitsForALessThanB() {
        int a = 0;
        int b = 10;
        int[] expected = {a, b};
        assertArrayEquals(expected, Bloco4Utils.checkAndCorrectLimits(a, b));
    }

    @Test
    public void shouldReturnCorrectedLimitsForBLessThanA() {
        int a = 10;
        int b = 0;
        int[] expected = {b, a};
        assertArrayEquals(expected, Bloco4Utils.checkAndCorrectLimits(a, b));
    }

    @Test
    public void shouldReturnNullForLowerLimitLessThanZero() {
        int a = 10;
        int b = -1;
        assertNull(Bloco4Utils.checkAndCorrectLimits(a, b));
    }

    @Test
    public void shouldReturnMultiplesOfNBetweenLimits() {
        int x = 3;
        int a = 0;
        int b = 10;
        int[] expected = {0, 3, 6, 9};
        assertArrayEquals(expected, Bloco4Utils.getMultiplesOfNBetweenLimits(x, a, b));
    }

    @Test
    public void shouldReturnNullForLimitLessThanZero() {
        int x = 3;
        int a = -1;
        int b = 10;
        assertNull(Bloco4Utils.getMultiplesOfNBetweenLimits(x, a, b));
    }

    @Test
    public void shouldReturnAllNumbersForXEqualsZero() {
        int x = 0;
        int a = 0;
        int b = 3;
        int[] expected = {0, 1, 2, 3};
        assertArrayEquals(expected, Bloco4Utils.getMultiplesOfNBetweenLimits(x, a, b));
    }


}