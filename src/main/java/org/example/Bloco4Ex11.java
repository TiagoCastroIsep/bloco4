package org.example;

import java.util.*;
import java.util.stream.Stream;

public class Bloco4Ex11 {

    public static void main(String[] args) {
        int a = 4;
        int b = 12;
        int[] multiplesOf = {2, 3};
        System.out.println("Result with normal arrays: " + Arrays.toString(getMultiplesOfNumbersInRange(a, b, multiplesOf)));
    }

    public static int[] getMultiplesOfNumbersInRange(int a, int b, int[] numbers) {
        if (numbers.length == 0) return null;
        int[] limits = Bloco4Utils.checkAndCorrectLimits(a, b);
        if (limits == null) return null;

        int minLimit = limits[0];
        int maxLimit = limits[1];

        /** using ArrayList to avoid getting the arrayLength beforehand or cleanup of the array afterward **/
        findCommonMultiplesWithArrayList(numbers, minLimit, maxLimit);
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

    private static void findCommonMultiplesWithArrayList(int[] numbers, int minLimit, int maxLimit) {
        List<Integer> list = new ArrayList<>();

        for (int i = minLimit; i <= maxLimit; i++) {
            int count = 0;

            for (int number : numbers) {
                if (i % number == 0) {
                    count++;
                }
            }
            if (count == numbers.length) list.add(i);
        }

        System.out.println("Result with ArrayList: " + list);
    }

    private static int getArrayLengthForCommonMultiples(int[] numbers, int minLimit, int maxLimit) {
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
