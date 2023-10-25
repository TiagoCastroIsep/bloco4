package org.example;

public class Bloco4Ex8 {
    public static int[] getTheFirstNElements(int n, int[] array) {
        if (n <= 0) return null;
        if (n > array.length) return null;

        if (!Bloco4Utils.validateAllArrayElementsBiggerThanZero(array)) return null;

        int[] reducedArray = new int[n];
        for (int i = 0; i < n; i++) reducedArray[i] = array[i];

        return reducedArray;
    }
}
