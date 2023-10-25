package org.example.playground;

import java.util.Arrays;

public class GetLengthInArrayAndTruncate {
    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;

        long startTime = System.currentTimeMillis();

        int[] arrPairs = getArrayOfPairsAndLength(array);
        //System.out.println(Arrays.toString(arrPairs));

        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("Execution duration: " + finalTime + " milliseconds.");
        /** Execution duration: 45 milliseconds. ~max = 54 millis **/
        /** Execution duration: 417 milliseconds. With +1 zero **/
    }

    private static int[] getArrayOfPairsAndLength(int[] arr) {
        int[] pairs = new int[arr.length + 1];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                pairs[count + 1] = arr[i];
                count++;
            }
        }

        pairs[0] = count;

        return truncateArray(pairs);
    }

    private static int[] truncateArray(int[] array) {
        int truncArrayLength = array[0];
        int[] truncArray = new int[truncArrayLength];

        for (int i = 0; i < truncArrayLength; i++) {
            truncArray[i] = array[i + 1];
        }

        return truncArray;
    }
}
