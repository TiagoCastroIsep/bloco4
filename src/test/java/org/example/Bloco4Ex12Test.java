package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bloco4Ex12Test {
    static final Bloco4Ex12 bloco4Ex12 = new Bloco4Ex12();
    @Test
    public void shouldReturnTheNumberIsNotPairPalindrome() {
        int number = 1234321;
        assertTrue(bloco4Ex12.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnTheNumberIsPairPalindrome() {
        int number = 123321;
        assertTrue(bloco4Ex12.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnTheNumberIsNotPalindromeOuterDiff() {
        int number = 1234322;
        assertFalse(bloco4Ex12.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnTheNumberIsNotPalindromeInnerDiff() {
        int number = 12342321;
        assertFalse(bloco4Ex12.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnFalseIfNumberIsLessOrEqualsZero() {
        int number = 0;
        assertTrue(bloco4Ex12.checkCompleteNumberIsPalindrome(number));
    }

    @Test
    public void shouldReturnIsNotPalindromeForNumberLessThanZero() {
        int number = -1;
        assertFalse(bloco4Ex12.checkCompleteNumberIsPalindrome(number));
    }
}