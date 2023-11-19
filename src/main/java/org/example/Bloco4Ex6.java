package org.example;

public class Bloco4Ex6 {
    static Bloco4Utils bloco4Utils = new Bloco4Utils();
    public static int sumOfAllPairsInNumberIntPositive(int number) {
        int[] digitsArray = bloco4Utils.getArrayFromIntNumber(number);
        if (digitsArray == null) return -1;

        int[] reducedArrayOfPairs = bloco4Utils.reducedArrayOfPairsOrNotPairs(digitsArray, true);

        return bloco4Utils.sumOfArrayElementsFromIntArrayInput(reducedArrayOfPairs);
    }
}
