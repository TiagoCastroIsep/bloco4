package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bloco4Ex11 {

    public static void main(String[] args) {
        int a = 4;
        int b = 12;
        int[] multiplesOf = {2, 3};
        System.out.println(Arrays.toString(getMultiplesOfNumbersInRange(a, b, multiplesOf)));
    }

    public static int[] getMultiplesOfNumbersInRange(int a, int b, int[] numbers) {
        if (numbers.length == 0) return null;
        int[] limits = Bloco4Utils.checkAndCorrectLimits(a, b);
        if (limits == null) return null;

        int minLimit = limits[0];
        int maxLimit = limits[1];

        int arrayLength = getArrayLengthForCommonMultiples(minLimit, maxLimit, numbers);

        int[] commonMultiples = new int[arrayLength];
//        findCommonMultiplesSet(numbers, minLimit, maxLimit, commonMultiples);
        findCommonMultiples(numbers, minLimit, maxLimit, commonMultiples);

        return commonMultiples;
    }

    private static void findCommonMultiplesSet(int[] numbers, int minLimit, int maxLimit, int[] commonMultiples) {
        Set<Integer> list = new HashSet<>();

        for (int i = minLimit; i <= maxLimit; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (i % numbers[j] == 0 && i % numbers[j + 1] == 0) {
                    list.add(i);
                }
            }
        }

        System.out.println(Arrays.toString(list.toArray()));
    }

    private static void findCommonMultiples(int[] numbers, int minLimit, int maxLimit, int[] commonMultiples) {
        int k = 0;

        for (int i = minLimit; i <= maxLimit; i++) {
            int count = 0;

            for (int number : numbers) {
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

    private static int getArrayLengthForCommonMultiples(int minLimit, int maxLimit, int[] numbers) {
        int k = 0;

        for (int i = minLimit; i <= maxLimit; i++) {
            int count = 0;
            for (int number : numbers) {
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
