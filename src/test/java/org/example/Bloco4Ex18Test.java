package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex18Test {
    @Test
    void shouldReturnMinNumberInArray() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        assertEquals(2, Bloco4Ex18.getMinNumberInArray(numbers, true));
    }

    @Test
    void shouldReturnMaxNumberInArray() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        assertEquals(8, Bloco4Ex18.getMinNumberInArray(numbers, false));
    }

    @Test
    void shouldReturnAverageFromArrayValues() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        assertEquals(4.55, Bloco4Ex18.getAverageFromArrayValues(numbers), 0.01);
    }

    @Test
    void shouldReturnProductOfArrayElements() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        assertEquals(403200, Bloco4Ex18.getProductOfArrayElements(numbers));
    }

    @Test
    void shouldReturnSetOfNonRepeatedNumbers() {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        assertArrayEquals(new int[] {2, 3, 4, 5, 8, 7}, Bloco4Ex18.getSetOfNonRepeatedNumbers(numbers));
    }

    @Test
    void shouldReturnNullWhenArrayIsEmpty() {
        int[] numbers = new int[0];
        assertNull(Bloco4Ex18.getSetOfNonRepeatedNumbers(numbers));
    }
}