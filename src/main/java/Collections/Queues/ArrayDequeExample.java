package Collections.Queues;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Create an ArrayDeque of String type
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements to the ArrayDeque
        deque.add("A");
        deque.addFirst("B");
        deque.addLast("C");

        // Display the ArrayDeque
        System.out.println("ArrayDeque: " + deque); // Output: ArrayDeque: [B, A, C]

        // Accessing elements
        System.out.println("First element: " + deque.getFirst()); // Output: First element: B
        System.out.println("Last element: " + deque.getLast()); // Output: Last element: C

        // Removing elements from the ArrayDeque
        deque.removeFirst();
        deque.removeLast();
        System.out.println("ArrayDeque after removals: " + deque); // Output: ArrayDeque after removals: [A]

        // Iterating through the ArrayDeque
        System.out.println("Iterating through the array deque:"); // Output: Iterating through the array deque:
        for (String element : deque) {
            System.out.println(element);
        }
        // Output: A
    }
}