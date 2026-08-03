package Collections.Lists;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList to store String elements
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Bird");

        // Print the elements of the LinkedList
        System.out.println("LinkedList elements: " + linkedList); // Output: LinkedList elements: [Dog, Cat, Bird]

        // Access the first and last elements
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("First element: " + firstElement); // Output: First element: Dog
        System.out.println("Last element: " + lastElement); // Output: Last element: Bird

        // Remove an element from the LinkedList
        linkedList.remove("Cat");
        System.out.println("LinkedList after removing Cat: " + linkedList); // Output: LinkedList after removing Cat: [Dog, Bird]

        // Iterate over the LinkedList elements
        System.out.print("Iterating over LinkedList: ");
        for (String animal : linkedList) {
            System.out.print(animal + " ");
        }
        // Output: Iterating over LinkedList: Dog Bird
    }
}
