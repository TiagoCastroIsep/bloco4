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
