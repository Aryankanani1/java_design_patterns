package Generics;

// Demonstrates the use of a generic method in Java

public class GenericMethodExample {

    // Define a generic method that prints array elements
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create an Integer array and print it using the generic method
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: "); // Output: Integer Array: 1 2 3 4 5
        printArray(intArray);

        // Create a String array and print it using the generic method
        String[] strArray = {"A", "B", "C", "D"};
        System.out.print("String Array: "); // Output: String Array: A B C D
        printArray(strArray);
    }
}