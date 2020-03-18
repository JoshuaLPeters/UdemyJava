//package ArrayExercises;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ArrayChallenge {
//
//    private static Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {
//        // Create a program using arrays that sorts a list of integers in descending order.
//
//        int[] myIntegers = getIntegers(5);
//        int[] sorted = sortIntegers(myIntegers);
//        printArray(sorted);
//    }
//    public static int[] getIntegers(int capacity){
//        int[] array = new int[capacity];
//        System.out.println("Enter " + capacity + " integer values:\r");
//        for(int i = 0; i < array.length; i++){
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//
//    // prints the array
//    public static void printArray(int[] array){
//        for(int i =0; i<array.length; i++){
//            System.out.println("Element " + i + " contents " + array[i]);
//        }
//    }
//
//    // copies the array
//    public static int[] sortIntegers(int[] array){
////        int[] sortedArray = new int[array.length];
////        for(int i = 0; i <array.length; i++){
////            sortedArray[i] = array[i];
////        }
//        int[] sortedArray = Arrays.copyOf(array, array.length); // built in java function to save time
//
//
//        boolean flag = true;
//        int temp; // Used to swap positions in the array.
//        while(flag){
//            flag = false;
//            // first round of the while loop
//            // Element 0    50
//            // Element 1    160
//            // Element 2    40
//
//            // second round of the while loop
//            // Element 0    160
//            // Element 1    50
//            // Element 2    40
//
//            for(int i = 0; i < sortedArray.length -1; i++){
//                if( sortedArray[i] < sortedArray[i+1] ){
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        return sortedArray;
//    }
//
//
//}
