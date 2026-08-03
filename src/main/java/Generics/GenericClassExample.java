package Generics;

// Demonstrates the use of a generic class with multiple type parameters

// Define a generic class with two type parameters T and U
class Pair<T, U> {
    private T first;
    private U second;

    // Constructor to initialize the pair
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter method for the first element
    public T getFirst() {
        return first;
    }

    // Getter method for the second element
    public U getSecond() {
        return second;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {
        // Create a Pair of Integer and String
        Pair<Integer, String> pair = new Pair<>(1, "One");
        System.out.println("First: " + pair.getFirst() + ", Second: " + pair.getSecond()); // Output: First: 1, Second: One

        // Create a Pair of String and Double
        Pair<String, Double> anotherPair = new Pair<>("Pi", 3.14);
        System.out.println("First: " + anotherPair.getFirst() + ", Second: " + anotherPair.getSecond()); // Output: First: Pi, Second: 3.14
    }
}