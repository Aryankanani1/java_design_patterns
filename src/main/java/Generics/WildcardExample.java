package Generics;

// Demonstrates the use of wildcards in Java

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {

    // Method to print the list with an unbounded wildcard
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Method to sum the numbers in the list with an upper bounded wildcard
    public static double sumList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a list of integers and print it
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.print("Integer List: ");
        printList(integerList);

        // Create a list of doubles and print it
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);
        System.out.print("Double List: ");
        printList(doubleList);

        // Calculate the sum of the integer list
        System.out.println("Sum of Integer List: " + sumList(integerList));

        // Calculate the sum of the double list
        System.out.println("Sum of Double List: " + sumList(doubleList));
    }
}