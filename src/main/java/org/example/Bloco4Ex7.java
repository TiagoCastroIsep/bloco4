package org.example;

public class Bloco4Ex7 {
    public static int sumOfAllNotPairsInNumberIntPositive(int number) {
        int[] digitsArray = Bloco4Utils.getArrayFromIntNumber(number);
        if (digitsArray == null) return -1;

        int[] reducedArrayOfPairs = Bloco4Utils.reducedArrayOfPairsOrNotPairs(digitsArray, false);

        return Bloco4Utils.sumOfArrayElementsFromIntArrayInput(reducedArrayOfPairs);
    }
}
