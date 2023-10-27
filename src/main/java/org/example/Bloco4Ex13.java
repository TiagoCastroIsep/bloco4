package org.example;

import java.util.*;

public class Bloco4Ex13 {

    public static int getMinOrMaxValueFromArray(int[] numbers, boolean minValue) {
        if (numbers.length == 0) return -1;

        int currentValue = numbers[0];
        if (minValue) {
            for (int num : numbers) if (num < currentValue) currentValue = num;

            return currentValue;
        }
        for (int num : numbers) if (num > currentValue) currentValue = num;

        return currentValue;
    }

    public static double getAverageFromArrayValues(int[] numbers) {
        if (numbers.length == 0) return -1;

        int totalElements = numbers.length;

        double sumOfElements = 0;
        for (int num : numbers) sumOfElements += num;

        return sumOfElements / totalElements;
    }

    public static int getProductOfArrayElements(int[] numbers) {
        if (numbers.length == 0) return -1;

        int productOfNumbers = 1;
        for (int num : numbers) productOfNumbers *= num;

        return productOfNumbers;
    }

    public static int[] getSetOfNonRepeatedNumbers(int[] numbers) {
        if (numbers.length == 0) return null;
        int[] setOfNumbers = new int[numbers.length + 1];
        int reducedArrayLength = 0;

        for (int i = 0, j = 1; i < numbers.length; i++) {
            boolean isRepeated = false;
            for (int k = 1; k < numbers.length; k++) {
                if (k <= i) continue;
                if (numbers[i] == numbers[k]) {
                    isRepeated = true;
                }
            }
            if (!isRepeated) {
                setOfNumbers[j] = numbers[i];
                j++;
                reducedArrayLength++;
            }
        }

        setOfNumbers[0] = reducedArrayLength;

        return getReducedSetOfNumbersArray(numbers, setOfNumbers);
    }

    public static int[] getReversedNumbers(int[] numbers) {
        if (numbers.length == 0) return null;

        int[] reversedNumbers = new int[numbers.length];
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversedNumbers[j] = numbers[i];
        }

        return reversedNumbers;
    }

    private static int[] getReducedSetOfNumbersArray(int[] numbers, int[] setOfNumbers) {
        if (numbers.length == setOfNumbers.length) return setOfNumbers;

        int arrayLength = setOfNumbers[0];

        int[] reducedArray = new int[arrayLength];

        for (int i = 0; i < reducedArray.length; i++) {
            reducedArray[i] = setOfNumbers[i + 1];
        }

        return reducedArray;
    }

    /** ADDITIONAL FOR REMOVING DUPLICATES FROM ARRAY **/

    public static void main(String[] args) {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        System.out.println(Arrays.toString(getSetOfNonRepeatedNumbers(numbers)));
        // LinkedHashMap is used to preserve the order of insertion
        getSetOfNonRepeatedNumbersWithHashMap(numbers);
        // HashSet is used to remove duplicates and sort the elements
        getSetOfNonRepeatedNumbersWithHashSet(numbers);
    }

    private static void getSetOfNonRepeatedNumbersWithHashMap(int[] numbers) {
        Map<Integer, Integer> elements = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            elements.put(numbers[i], i);
        }

        List<Integer> setOfUniqueNumbers = new ArrayList<>(elements.keySet());

        System.out.println("With HashMap: " + setOfUniqueNumbers);
    }

    private static void getSetOfNonRepeatedNumbersWithHashSet(int[] numbers) {
        Set<Integer> elements = new HashSet<>();
        for (int number : numbers) elements.add(number);

        System.out.println("With HashSet: " + elements);
    }
}
