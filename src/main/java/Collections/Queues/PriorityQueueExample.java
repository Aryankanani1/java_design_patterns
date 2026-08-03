package Collections.Queues;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of Integer type
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);

        // Display the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue); // Output: PriorityQueue: [5, 20, 10]

        // Accessing the head of the PriorityQueue
        System.out.println("Head of queue: " + priorityQueue.peek()); // Output: Head of queue: 5

        // Removing elements from the PriorityQueue
        priorityQueue.poll();
        System.out.println("PriorityQueue after polling: " + priorityQueue); // Output: PriorityQueue after polling: [10, 20]

        // Iterating through the PriorityQueue
        System.out.println("Iterating through the priority queue:"); // Output: Iterating through the priority queue:
        for (Integer element : priorityQueue) {
            System.out.println(element);
        }
       // Output:
//        10
//        20
    }
}