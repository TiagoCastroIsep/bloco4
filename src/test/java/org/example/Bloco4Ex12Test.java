package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex12Test {
    @Test
    public void shouldReturnTheNumberIsPalindrome() {
        int number = 1234321;
        assertTrue(Bloco4Ex12.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnTheNumberIsNotPalindrome() {
        int number = 1234322;
        assertFalse(Bloco4Ex12.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnFalseIfNumberIsLessOrEqualsZero() {
        int number = 0;
        assertTrue(Bloco4Ex12.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnIsNotPalindromeForNumberLessThanZero() {
        int number = -1;
        assertFalse(Bloco4Ex12.checkCompleteNumberIsPalindrome(number));
    }
}