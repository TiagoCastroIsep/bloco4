package org.example;

import java.util.*;

public class Bloco4Ex13 {

    public static int getMinOrMaxValueFromArray(int[] numbers, boolean minValue) {
        return Bloco4Utils.getMinOrMaxValueFromArray(numbers, minValue);
    }

    public static double getAverageFromArrayValues(int[] numbers) {
        return Bloco4Utils.getAverageFromArrayValues(numbers);
    }

    public static int getProductOfArrayElements(int[] numbers) {
        return Bloco4Utils.getProductOfArrayElements(numbers);
    }

    public static int[] getSetOfNonRepeatedNumbers(int[] numbers) {
        return Bloco4Utils.getSetOfNonRepeatedNumbers(numbers);
    }

    public static int[] getReversedNumbers(int[] numbers) {
        if (numbers.length == 0) return null;

        int[] reversedNumbers = new int[numbers.length];
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversedNumbers[j] = numbers[i];
        }

        return reversedNumbers;
    }
}
