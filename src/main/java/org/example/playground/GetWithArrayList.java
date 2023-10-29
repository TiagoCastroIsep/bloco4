package org.example.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetWithArrayList {
    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;

        long startTime = System.currentTimeMillis();

        List<Integer> pairs = getPairsWithArrayList(array);
//        System.out.println(Arrays.toString(getArrayOfPairs(pairs)));

        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("Execution duration: " + finalTime + " milliseconds.");
        /** Execution duration: 215 milliseconds. **/
        /** Execution duration: 1779 milliseconds. With +1 zero **/
    }

    public static List<Integer> getPairsWithArrayList(int[] arr) {
        List<Integer> pairs = new ArrayList<>();

        for (int j : arr) {
            if (j % 2 == 0) {
                pairs.add(j);
            }
        }

        return pairs;
    }
}
