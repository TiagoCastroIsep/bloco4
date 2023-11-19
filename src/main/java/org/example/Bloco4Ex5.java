package org.example;

public class Bloco4Ex5 {
    static Bloco4Utils bloco4Utils = new Bloco4Utils();
    public static int[] getNotPairsArrayFromArrayOfInts(int[] numbers) {
        return bloco4Utils.reducedArrayOfPairsOrNotPairs(numbers, false);
    }
}
