package org.example;

public class Bloco4Ex12 {
    static Bloco4Utils bloco4Utils = new Bloco4Utils();
    public static boolean checkCompleteNumberIsPalindrome(int number) {
        if (bloco4Utils.validateNumberIsEqualsOrBiggerThanZeroAndInsideIntLimits(number) == -1) return false;
        if (number == 0) return true;

        int[] digitsArray = bloco4Utils.getArrayFromIntNumber(number);

        if (digitsArray == null) return false;

        for (int i = 0; i < (digitsArray.length / 2); i++) {
            if (digitsArray[i] != digitsArray[digitsArray.length - (i + 1)]) {
                return false;
            }
        }

        return true;
    }
}
