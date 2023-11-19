package org.example;

public class Bloco4Ex7 {
    static Bloco4Utils bloco4Utils = new Bloco4Utils();
    public static int sumOfAllNotPairsInNumberIntPositive(int number) {
        int[] digitsArray = bloco4Utils.getArrayFromIntNumber(number);
        if (digitsArray == null) return -1;

        int[] reducedArrayOfPairs = bloco4Utils.reducedArrayOfPairsOrNotPairs(digitsArray, false);

        return bloco4Utils.sumOfArrayElementsFromIntArrayInput(reducedArrayOfPairs);
    }
}
