package org.example.playground;

import java.util.Arrays;

public class FilterAndKeepDuplicatesFromArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 3, 4, 5, 6, 4, 3};
        //setting array length to 2 because in this case I know it's just 2 elements
        int[] onlyDuplicates = new int[2];

        int duplicatesIndex = 0;
        for (int i = 0; i < originalArray.length; i++)
            for (int j = i + 1; j < originalArray.length; j++)
                if (originalArray[i] == originalArray[j]) {
                    if (numberIsPresent(onlyDuplicates, originalArray[i])) break;
                    onlyDuplicates[duplicatesIndex] = originalArray[i];
                    duplicatesIndex++;
                    break;
                }

        System.out.println(Arrays.toString(onlyDuplicates));
    }

    private static boolean numberIsPresent(int[] onlyDuplicates, int currentNumber) {
        for (int duplicate : onlyDuplicates) {
            if (currentNumber == duplicate) return true;
        }
        return false;
    }
}
