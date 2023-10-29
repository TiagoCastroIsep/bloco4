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

    /** Ex. 13 and 18 **/

    public static int getMinOrMaxValueFromArray(int[] numbers, boolean minValue) {
        if (numbers.length == 0) return -1;

        int currentValue = numbers[0];
        if (minValue) {
            for (int num : numbers) if (num < currentValue) currentValue = num;

            return currentValue;
        }
        for (int num : numbers) if (num > currentValue) currentValue = num;

        return currentValue;
    }

    public static double getAverageFromArrayValues(int[] numbers) {
        if (numbers.length == 0) return -1;

        int totalElements = numbers.length;

        double sumOfElements = 0;
        for (int num : numbers) sumOfElements += num;

        return sumOfElements / totalElements;
    }

    public static int getProductOfArrayElements(int[] numbers) {
        if (numbers.length == 0) return -1;

        int productOfNumbers = 1;
        for (int num : numbers) productOfNumbers *= num;

        return productOfNumbers;
    }

    /**START - EX 13**/
    public static int[] getSetOfNonRepeatedNumbers(int[] numbers) {
        if (numbers.length == 0) return null;
        int[] setOfNumbers = new int[numbers.length + 1];
        filterDuplicatesLogic(numbers, setOfNumbers);

        return getReducedSetOfNumbersArray(numbers, setOfNumbers);
    }

    private static void filterDuplicatesLogic(int[] numbers, int[] setOfNumbers) {
        int reducedArrayLength = 0;

        for (int i = 0, j = 1; i < numbers.length; i++) {
            boolean isRepeated = false;
            for (int k = 1; k < numbers.length; k++) {
                if (k <= i) continue;
                if (numbers[i] == numbers[k]) {
                    isRepeated = true;
                }
            }
            if (!isRepeated) {
                setOfNumbers[j] = numbers[i];
                j++;
                reducedArrayLength++;
            }
        }

        setOfNumbers[0] = reducedArrayLength;
    }

    public static int[] getReducedSetOfNumbersArray(int[] numbers, int[] setOfNumbers) {
        if (numbers.length == setOfNumbers.length) return setOfNumbers;

        int arrayLength = setOfNumbers[0];

        int[] reducedArray = new int[arrayLength];

        for (int i = 0; i < reducedArray.length; i++) {
            reducedArray[i] = setOfNumbers[i + 1];
        }

        return reducedArray;
    }
    /**END - EX 13**/

    /** EX 18 **/
    public static boolean isPrimeNumber(int number) {
        if (number < 2) return false;

        for (int i = 2; i < number; i++) if (number % i == 0) return false;

        return true;
    }

    public static boolean checkIfMatrixIsRectangular(int[][] matrix) {
        if (matrix.length == 0) return false;

        return matrix.length != matrix[0].length;
    }

    public static boolean checkIfMatrixIsSquare(int[][] matrix) {
        if (matrix.length == 0) return false;

        return matrix.length == matrix[0].length;
    }

    public static int[] getReversedArray(int[] matrix) {
        if (matrix.length == 0) return null;
        int[] reversedArray = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            reversedArray[i] = matrix[matrix.length - 1 - i];
        }

        return reversedArray;
    }
}
