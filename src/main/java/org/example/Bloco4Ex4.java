package org.example;

public class Bloco4Ex4 {
    static Bloco4Utils bloco4Utils = new Bloco4Utils();
    public int[] getPairsArrayFromArrayOfInts(int[] numbers) {
        return bloco4Utils.reducedArrayOfPairsOrNotPairs(numbers, true);
    }
}
