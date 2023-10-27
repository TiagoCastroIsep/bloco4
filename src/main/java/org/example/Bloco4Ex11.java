package org.example;

import java.util.*;

public class Bloco4Ex11 {

    public static void main(String[] args) {
        int a = 4;
        int b = 12;
        int[] multiplesOf = {2, 3};
        System.out.println("Result with normal arrays: " + Arrays.toString(getCommonMultiplesOfNumbersInRange(a, b, multiplesOf)));
    }

    public static int[] getCommonMultiplesOfNumbersInRange(int a, int b, int[] numbers) {
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
        findCommonMultiplesWithSet(numbers, minLimit, maxLimit);
        findCommonMultiplesV2(numbers, minLimit, maxLimit, commonMultiples);

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

    private static void findCommonMultiplesWithSet(int[] numbers, int minLimit, int maxLimit) {
        Set<Integer> commonMultiples = new HashSet<>();

        // Get multiples of the first number. I need to do this, so I can later run the retainAll() method,
        // which will intersect values with a current set and modify the current Set for the retained ones only.
        for (int i = minLimit; i <= maxLimit; i++) {
            if (i % numbers[0] == 0) {
                commonMultiples.add(i);
            }
        }

        // For the rest of the numbers, retain only common multiples
        for (int i = 1; i < numbers.length; i++) {
            Set<Integer> currentMultiples = new HashSet<>();
            for (int j = minLimit; j <= maxLimit; j++) {
                if (j % numbers[i] == 0) {
                    currentMultiples.add(j);
                }
            }
            commonMultiples.retainAll(currentMultiples);
        }

        System.out.println("Result with sets: " + commonMultiples);
    }

    public static void findCommonMultiplesV2(int[]numbers, int minLimit, int maxLimit, int[] commonMultiples) {
        int count = 0;

        for (int i = minLimit; i <= maxLimit; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if (i % numbers[j] != 0) break;
                if (j==(numbers.length-1)) {
                    commonMultiples[count] = i;
                    count++;
                }
            }
        }

        System.out.println("Result with normal arrays v2: " + Arrays.toString(commonMultiples));
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
