package org.example;

import java.util.*;

public class Bloco4Ex11 {
    static Bloco4Utils bloco4Utils = new Bloco4Utils();
    public static int[] getCommonMultiplesOfNumbersInRange(int a, int b, int[] numbers) {
        if (numbers.length == 0) return null;
        int[] limits = bloco4Utils.checkAndCorrectLimits(a, b);
        if (limits == null) return null;

        int minLimit = limits[0];
        int maxLimit = limits[1];

        int arrayLength = getArrayLengthForCommonMultiples(numbers, minLimit, maxLimit);

        int[] commonMultiples = new int[arrayLength];
        findCommonMultiples(numbers, minLimit, maxLimit, commonMultiples);

        return commonMultiples;
    }

    private static void findCommonMultiples(int[] numbers, int minLimit, int maxLimit, int[] commonMultiples) {
        int k = 0;

        for (int i = minLimit; i <= maxLimit; i++) {
            int count = 0;

            for (int number : numbers) {
                if (number == 0) {
                    count++;
                    continue;
                }
                if (i % number == 0) {
                    count++;
                }
            }
            if (count == numbers.length) {
                commonMultiples[k] = i;
                k++;
            }
        }
    }

    private static int getArrayLengthForCommonMultiples(int[] numbers, int minLimit, int maxLimit) {
        int k = 0;
        for (int i = minLimit; i <= maxLimit; i++) {
            int count = 0;
            for (int number : numbers) {
                if (number == 0) {
                    count++;
                    continue;
                }
                if (i % number == 0) {
                    count++;
                }
            }
            if (count == numbers.length) {
                k++;
            }
        }
        return k;
    }
}
