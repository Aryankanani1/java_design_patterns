package Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of String type using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("A");
        queue.add("B");
        queue.add("C");

        // Display the Queue
        System.out.println("Queue: " + queue); // Output: Queue: [A, B, C]

        // Accessing the head of the Queue
        System.out.println("Head of queue: " + queue.peek()); // Output: Head of queue: A

        // Removing elements from the Queue
        queue.remove();
        System.out.println("Queue after removing an element: " + queue); // Output: Queue after removing an element: [B, C]

        // Polling elements from the Queue
        String polledElement = queue.poll();
        System.out.println("Polled element: " + polledElement); // Output: Polled element: B
        System.out.println("Queue after polling an element: " + queue); // Output: Queue after polling an element: [C]

        // Iterating through the Queue
        System.out.println("Iterating through the queue:"); // Output: Iterating through the queue:
        for (String element : queue) {
            System.out.println(element);
        }
        // Output: C
    }
}