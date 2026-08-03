package Collections.Sets;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Integer type
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);

        // Display the TreeSet
        System.out.println("Numbers: " + numbers); // Output: Numbers: [5, 10, 20]

        // Accessing the first and last elements
        System.out.println("First number: " + numbers.first()); // Output: First number: 5
        System.out.println("Last number: " + numbers.last()); // Output: Last number: 20

        // Iterating through the TreeSet
        System.out.println("Iterating through the set:"); // Output: Iterating through the set:
        for (int number : numbers) {
            System.out.println(number);
        }
        // Output:
//        5
//        10
//        20


        // Removing an element
        numbers.remove(10);
        System.out.println("Numbers after removal: " + numbers); // Output: Numbers after removal: [5, 20]
    }
}