package org.example;

public class Bloco4Utils {
    public static int getNumberOfDigits(int number) {
        int validated = validateNumberIsEqualsOrBiggerThanZeroAndInsideIntLimits(number);
        if (validated == -1) return -1;

        if (number == 0) return 1;

        int reducedNumber = number;

        int count = 0;
        while (reducedNumber != 0) {
            count++;
            reducedNumber /= 10;
        }

        return count;
    }

    public static int[] getArrayFromIntNumber(int number) {
        int validated = validateNumberIsEqualsOrBiggerThanZeroAndInsideIntLimits(number);
        if (validated == -1) return null;

        int arrayLength = getNumberOfDigits(number);
        int[] arrayFromNumberDigits = new int[arrayLength];

        for (int i = arrayLength - 1; i >= 0; i--) {
            arrayFromNumberDigits[i] = number % 10;
            number /= 10;
        }

        return arrayFromNumberDigits;
    }

    public static int sumOfArrayElementsFromIntArrayInput(int[] digitsArray) {
        int sum = 0;
        for (int digit : digitsArray) {
            sum += digit;
        }
        return sum;
    }

    public static int[] reducedArrayOfPairsOrNotPairs(int[] numbers, boolean pair) {
        int arrayLength = countNumberOfPairOrNotPairElementsInArray(numbers, pair);
        int[] reducedArray = new int[arrayLength];
        if (pair) {
            for (int i = 0, j = 0; i < numbers.length; i++) if (numbers[i] % 2 == 0) {
                    reducedArray[j] = numbers[i];
                    j++;
            }
            return reducedArray;
        }

        for (int i = 0, j = 0; i < numbers.length; i++) if (numbers[i] % 2 != 0) {
                reducedArray[j] = numbers[i];
                j++;
            }
        return reducedArray;
    }

    private static int countNumberOfPairOrNotPairElementsInArray(int[] numbers, boolean pair) {
        int count = 0;

        if (pair) {
            for (int number : numbers) if (number % 2 == 0) count++;
            return count;
        }

        for (int number : numbers) if (number % 2 != 0) count++;
        return count;
    }

    // TODO: method test
    public static int[] getMultiplesOfNBetweenLimits(int x, int a, int b) {
        int[] limits = checkAndCorrectLimits(a, b);
        if (limits == null) return null;

        int minLimit = limits[0];
        int maxLimit = limits[1];
        if (x == 0) return getReturnFromXEqualsZero(minLimit, maxLimit);

        int arraySize = getNumberOfMultiples(x, minLimit, maxLimit);

        int[] result = new int[arraySize];

        for (int i = 0, j = 0; i <= (maxLimit - minLimit); i++) {
            if ((minLimit + i) % x == 0) {
                result[j] = minLimit + i;
                j++;
            }
        }
        return result;
    }

    private static int[] getReturnFromXEqualsZero(int minLimit, int maxLimit) {
        int[] resultArray = new int[maxLimit - minLimit + 1];

        for (int i = 0; i <= (maxLimit - minLimit); i++) {
            resultArray[i] = minLimit + i;
        }

        return resultArray;
    }

    private static int getNumberOfMultiples(int x, int minLimit, int maxLimit) {
        int multiplesCount = 0;

        for (int i = 0; i <= (maxLimit - minLimit); i++) {
            if ((minLimit + i) % x == 0) multiplesCount++;
        }

        return multiplesCount;
    }

    public static int validateNumberIsEqualsOrBiggerThanZeroAndInsideIntLimits(int number) {
        if (number < 0) return -1;
        if (number > 1000000000) return -1;
        return 1;
    }

    public static boolean validateAllArrayElementsBiggerThanZero(int[] array) {
        for (int element : array) if (element < 0) return false;
        return true;
    }

    public static int[] checkAndCorrectLimits(int a, int b) {
        int minLimit = a;
        int maxLimit = b;

        if (b < a) {
            minLimit = b;
            maxLimit = a;
        }

        /** not accepting negative limits**/
        if (minLimit < 0) return null;

        return new int[] {minLimit, maxLimit};
    }
}
