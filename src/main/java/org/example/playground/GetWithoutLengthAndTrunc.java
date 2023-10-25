package org.example.playground;

import java.util.Arrays;

public class GetWithoutLengthAndTrunc {
    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;

        long startTime = System.currentTimeMillis();

        int[] pairs = getArrayOfPairs(array);

//        System.out.println(Arrays.toString(getArrayOfPairs(pairs)));

        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("Execution duration: " + finalTime + " milliseconds.");
        /** Execution duration: 126 milliseconds. **/
    }

    private static int[] getArrayOfPairs(int[] arr) {
        /** only works for pairs. For multiples doesn't work **/
        int[] pairs = new int[(arr.length / 2)];

        for (int i = 0, j = 0; i < pairs.length; i++) {
            if (arr[i] % 2 == 0) {
                pairs[j] = arr[i];
                j++;
            }
        }

        return pairs;
    }
}
