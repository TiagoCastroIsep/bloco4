package org.example;

public class Bloco4Ex6 {
    public static int sumOfAllPairsInNumberIntPositive(int number) {
        int[] digitsArray = Bloco4Utils.getArrayFromIntNumber(number);
        if (digitsArray == null) return -1;

        int[] reducedArrayOfPairs = Bloco4Utils.reducedArrayOfPairsOrNotPairs(digitsArray, true);

        return Bloco4Utils.sumOfArrayElementsFromIntArrayInput(reducedArrayOfPairs);
    }
}
