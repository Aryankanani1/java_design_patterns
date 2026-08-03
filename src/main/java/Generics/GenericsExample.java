package Generics;

// Demonstrates the use of a generic class in Java

// Define a generic class with a type parameter T
class Box<T> {
    private T content;

    // Constructor to initialize the content
    public Box(T content) {
        this.content = content;
    }

    // Getter method to get the content
    public T getContent() {
        return content;
    }

    // Setter method to set the content
    public void setContent(T content) {
        this.content = content;
    }
}

public class GenericsExample {
    public static void main(String[] args) {
        // Create a Box for Integer type
        Box<Integer> integerBox = new Box<>(123);
        System.out.println("Integer Box content: " + integerBox.getContent()); // Output: Integer Box content: 123

        // Create a Box for String type
        Box<String> stringBox = new Box<>("Hello, Generics");
        System.out.println("String Box content: " + stringBox.getContent()); // Output: String Box content: Hello, Generics
    }
}