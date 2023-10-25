package org.example.playground;

import java.util.Arrays;

public class GetArrayLengthBefore {
    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;

        long startTime = System.currentTimeMillis();

        int[] pairs = getArrayOfPairs(array);

//        System.out.println(Arrays.toString(getArrayOfPairs(array)));

        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("Execution duration: " + finalTime + " milliseconds.");
        /** Execution duration: 33 milliseconds. ~max = 45 millis **/
        /** Execution duration: 269 milliseconds. With +1 zero **/
    }

    private static int[] getArrayOfPairs(int[] arr) {
        int arrayLength = getPairsArrayLength(arr);
        int[] pairs = new int[arrayLength];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                pairs[j] = arr[i];
                j++;
            }
        }

        return pairs;
    }

    private static int getPairsArrayLength(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element % 2 == 0) count++;
        }
        return count;
    }
}
