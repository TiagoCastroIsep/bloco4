package org.example;

public class Bloco4Ex14 {
    public static int getDotProductOfTwoArrays(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0) return -1;
        if (array1.length != array2.length) return -1;

        int dotProduct = 0;
        for (int i = 0; i < array1.length; i++) {
            dotProduct += array1[i] * array2[i];
        }

        return dotProduct;
    }
}
