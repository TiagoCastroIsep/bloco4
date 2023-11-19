package playground;

public class CreateArrayTime {
    public static void main(String[] args) {
//        int[] array = new int[100000000];
//
//        long startTime = System.currentTimeMillis();
//
//        for (int i = 0; i < array.length; i++) array[i] = 1;
//
//        long finalTime = System.currentTimeMillis() - startTime;
//        System.out.println("Execution duration: " + finalTime + " milliseconds.");
//        /** Execution duration: 41 milliseconds. ~max = 45 millis **/
//        /** Execution duration: 318 milliseconds. With +1 zero **/

//        int[] array1 = new int[1000000000];
//
//        long startTime1 = System.currentTimeMillis();
//
//        for (int i = 0; i < array1.length; i++) array1[i] = 0;
//
//        long finalTime1 = System.currentTimeMillis() - startTime1;
//        System.out.println("Execution duration: " + finalTime1 + " milliseconds.");
//        /** Execution duration: 39 milliseconds. ~max = 45 millis **/
//        /** Execution duration: 322 milliseconds. With +1 zero **/

//        int[] array2 = new int[1000000000];
//
//        long startTime2 = System.currentTimeMillis();
//
//        for (int i = 0; i < array2.length; i++) array2[i] = 10;
//
//        long finalTime2 = System.currentTimeMillis() - startTime2;
//        System.out.println("Execution duration: " + finalTime2 + " milliseconds.");
//        /** Execution duration: 41 milliseconds. ~max = 45 millis **/
//        /** Execution duration: 318 milliseconds. With +1 zero **/

        int[] array2 = new int[1000000000];

        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i < array2.length; i++) array2[i] = 100000;

        long finalTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("Execution duration: " + finalTime2 + " milliseconds.");
        /** Execution duration: 41 milliseconds. ~max = 45 millis **/
        /** Execution duration: 316 milliseconds. With +1 zero **/
    }
}
