package org.example;

public class Bloco4Ex3 {

    public static int sumOfArrayElements(int number) {
        int[] digitsArrayFromNumber = Bloco4Utils.getArrayFromIntNumber(number);
        if (digitsArrayFromNumber == null) return -1;

        return Bloco4Utils.sumOfArrayElementsFromIntArrayInput(digitsArrayFromNumber);
    }
}
