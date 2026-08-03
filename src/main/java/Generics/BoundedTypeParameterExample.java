package Generics;

// Demonstrates the use of bounded type parameters in Java

// Define a generic class with a bounded type parameter T
// T is bounded by the Number class, meaning T can only be a subclass of Number
class NumberBox<T extends Number> {
    private T content;

    // Constructor to initialize the content
    public NumberBox(T content) {
        this.content = content;
    }

    // Getter method to get the content
    public T getContent() {
        return content;
    }

    // Method to get the double value of the content
    public double getDoubleValue() {
        return content.doubleValue();
    }
}

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        // Create a NumberBox for Integer type
        NumberBox<Integer> integerBox = new NumberBox<>(123);
        System.out.println("Integer Box content: " + integerBox.getContent()); // Output: Integer Box content: 123
        System.out.println("Integer Box content as double: " + integerBox.getDoubleValue()); // Output: Integer Box content as double: 123.0

        // Create a NumberBox for Double type
        NumberBox<Double> doubleBox = new NumberBox<>(45.67);
        System.out.println("Double Box content: " + doubleBox.getContent()); // Output: Double Box content: 45.67
        System.out.println("Double Box content as double: " + doubleBox.getDoubleValue()); // Output: Double Box content as double: 45.67

        // Create a NumberBox for Float type
        NumberBox<Float> floatBox = new NumberBox<>(8.9f);
        System.out.println("Float Box content: " + floatBox.getContent()); // Output: Float Box content: 8.9
        System.out.println("Float Box content as double: " + floatBox.getDoubleValue()); // Output: Float Box content as double: 8.899999618530273
    }
}