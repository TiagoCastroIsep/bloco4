package playground;

import org.example.Bloco4Ex13;

import java.util.*;

public class Ex13Playground {
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 3, 4, 5, 3, 4, 5, 8, 7};
        System.out.println(Arrays.toString(Bloco4Ex13.getSetOfNonRepeatedNumbers(numbers)));
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
