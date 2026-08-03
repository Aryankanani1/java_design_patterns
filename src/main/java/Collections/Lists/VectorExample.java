package Collections.Lists;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector to store Integer elements
        Vector<Integer> vector = new Vector<>();

        // Add elements to the Vector
        vector.add(1);
        vector.add(2);
        vector.add(3);

        // Print the elements of the Vector
        System.out.println("Vector elements: " + vector); // Output: Vector elements: [1, 2, 3]

        // Access an element at a specific index
        int element = vector.get(1); // Index 1 corresponds to the second element
        System.out.println("Element at index 1: " + element); // Output: Element at index 1: 2

        // Remove an element from the Vector
        vector.remove((Integer) 2); // Remove the Integer value 2
        System.out.println("Vector after removing 2: " + vector); // Output: Vector after removing 2: [1, 3]

        // Iterate over the Vector elements
        System.out.print("Iterating over Vector: ");
        for (int number : vector) {
            System.out.print(number + " ");
        }
        // Output: Iterating over Vector: 1 3
    }
}