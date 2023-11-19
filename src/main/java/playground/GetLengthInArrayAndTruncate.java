package playground;

import java.util.Arrays;

public class GetLengthInArrayAndTruncate {
    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;

        long startTime = System.currentTimeMillis();

        int[] arrPairs = getArrayOfPairsAndLength(array);

        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("Execution duration: " + finalTime + " milliseconds.");
        /** Execution duration: 45 milliseconds. ~max = 54 millis **/
        /** Execution duration: 403 milliseconds. With +1 zero **/
    }

    private static int[] getArrayOfPairsAndLength(int[] arr) {
        long startTime3 = System.currentTimeMillis();
        int[] pairs = new int[arr.length + 1];
        long finalTime3 = System.currentTimeMillis() - startTime3;
        System.out.println("Creation of pairs array with excess length exec. time: " + finalTime3 + " milliseconds.");
        // 178 millis

        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                pairs[count + 1] = arr[i];
                count++;
            }
        }
        pairs[0] = count;
        long finalTime = System.currentTimeMillis() - startTime;
        System.out.println("For loop with excess array exec. time: " + finalTime + " milliseconds.");
        // 90 millis

        return truncateArray(pairs);
    }

    private static int[] truncateArray(int[] array) {
        long startTime = System.currentTimeMillis();
        int truncArrayLength = array[0];
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println("Assignment of arrayLength: " + endTime + " milliseconds.");
        // 0 millis

        long startTime1 = System.currentTimeMillis();
        int[] truncArray = new int[truncArrayLength];
        long endTime1 = System.currentTimeMillis() - startTime1;
        System.out.println("Creation of Short array: " + endTime1 + " milliseconds.");
        // 92 millis

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < truncArrayLength; i++) {
            truncArray[i] = array[i + 1];
        }
        long endTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("Fill Short array with for loop: " + endTime2 + " milliseconds.");
        // 35 millis

        return truncArray;
    }
}
