package CoreJava.JavaFeatures;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Creating an array
        int[] numbers = {5, 3, 8, 2, 9};

        // Printing the array
        System.out.println("Array: " + Arrays.toString(numbers)); // output: Array: [5, 3, 8, 2, 9]

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers)); // output: Sorted array: [2, 3, 5, 8, 9]

        // Searching in the array
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index); // output: Index of 8: 3

        // Filling the array
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled array: " + Arrays.toString(filledArray)); // output: Filled array: [7, 7, 7, 7, 7]

        // Copying the array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray)); // output: Copied array: [2, 3, 5, 8, 9]
    }
}
