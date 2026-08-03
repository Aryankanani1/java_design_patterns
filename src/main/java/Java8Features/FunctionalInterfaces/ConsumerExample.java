package Java8Features.FunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Consumer to print a string with a prefix
        Consumer<String> printWithPrefix = str -> System.out.println("Prefix: " + str);

        // Accept the consumer
        String testString = "Hello, World!";
        printWithPrefix.accept(testString); // Output: Prefix: Hello, World!
    }
}