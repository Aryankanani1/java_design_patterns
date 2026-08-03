package Collections.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Print the contents of the stack
        System.out.println("Stack: " + stack); // Output: Stack: [10, 20, 30, 40]

        // Peek at the top element without removing it
        System.out.println("Top element is: " + stack.peek()); // Output: Top element is: 40

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 40
        System.out.println("Popped element: " + stack.pop()); // Output: Popped element: 30

        // Print the contents of the stack after popping elements
        System.out.println("Stack after popping elements: " + stack); // Output: Stack after popping elements: [10, 20]

        // Check if the stack is empty
        if(stack.isEmpty()) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("The stack is not empty."); // Output: The stack is not empty.
        }

        // Search for an element in the stack
        int position = stack.search(10);
        if(position != -1) {
            System.out.println("Element 10 found at position: " + position); // Output: Element 10 found at position: 2
        } else {
            System.out.println("Element 10 not found in the stack.");
        }
    }
}