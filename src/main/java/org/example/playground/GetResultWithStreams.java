package org.example.playground;

import java.util.Arrays;

public class GetResultWithStreams {
    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;

        long startTime = System.currentTimeMillis();

        int[] pairs = Arrays.stream(array).filter(el -> el % 2 == 0).toArray();

//        System.out.println(Arrays.toString(getArrayOfPairs(pairs)));

        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("Execution duration: " + finalTime + " milliseconds.");
        /** Execution duration: 54 milliseconds. ~max = 56 millis **/
        /** Execution duration: 481 milliseconds. With +1 zero **/
    }
}
