package org.example;

public class Bloco4Ex3 {
    static Bloco4Utils bloco4Utils = new Bloco4Utils();
    public int sumOfArrayElements(int number) {
        int[] digitsArrayFromNumber = bloco4Utils.getArrayFromIntNumber(number);
        if (digitsArrayFromNumber == null) return -1;

        return bloco4Utils.sumOfArrayElementsFromIntArrayInput(digitsArrayFromNumber);
    }
}
