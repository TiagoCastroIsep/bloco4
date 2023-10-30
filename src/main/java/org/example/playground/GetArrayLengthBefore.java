package org.example.playground;

import java.util.Arrays;

public class GetArrayLengthBefore {
    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;

        long startTime = System.currentTimeMillis();
        int[] pairs = getArrayOfPairs(array);
        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("Total execution duration: " + finalTime + " milliseconds.");
        /** Execution duration: 33 milliseconds. ~max = 45 millis **/
        /** Execution duration: 269 milliseconds. With +1 zero **/
    }

    private static int[] getArrayOfPairs(int[] arr) {
        long startTime = System.currentTimeMillis();
        int arrayLength = getPairsArrayLength(arr);
        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("getPairsArrayLength exec. time: " + finalTime + " milliseconds.");
        // 91 milliseconds

        long startTime3 = System.currentTimeMillis();
        int[] pairs = new int[arrayLength];
        long finalTime3 = System.currentTimeMillis() - startTime3;
        System.out.println("creation of pairs array with arrayLength exec. time: " + finalTime3 + " milliseconds.");
        // 97 milliseconds

        long startTime2 = System.currentTimeMillis();
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                pairs[j] = arr[i];
                j++;
            }
        }

        long finalTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("for loop with short array exec. time: " + finalTime2 + " milliseconds.");
        // 87 milliseconds

        return pairs; // this return "costs" 5 milliseconds
    }

    private static int getPairsArrayLength(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element % 2 == 0) count++;
        }
        return count;
    }
}
