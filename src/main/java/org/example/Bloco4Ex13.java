package org.example;

public class Bloco4Ex13 {
    public static int getMinOrMaxValueFromArray(int[] numbers, boolean minValue) {
        if (numbers.length == 0) return -1;

        int currentValue = numbers[0];
        if (minValue) {
            for (int num : numbers) if (num < currentValue) currentValue = num;

            return currentValue;
        }
        for (int num : numbers) if (num > currentValue) currentValue = num;

        return currentValue;
    }
}
