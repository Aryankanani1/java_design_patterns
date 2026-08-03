package Collections.Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque of Integer type using ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the Deque
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(0);

        // Display the Deque
        System.out.println("Deque: " + deque); // Output: Deque: [0, 1, 2]

        // Accessing elements
        System.out.println("First element: " + deque.getFirst()); // Output: First element: 0
        System.out.println("Last element: " + deque.getLast()); // Output: Last element: 2

        // Removing elements from the Deque
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removals: " + deque); // Output: Deque after removals: [1]

        // Iterating through the Deque
        System.out.println("Iterating through the deque:"); // Output: Iterating through the deque:
        for (Integer element : deque) {
            System.out.println(element);
        }
        // Output: 1
    }
}