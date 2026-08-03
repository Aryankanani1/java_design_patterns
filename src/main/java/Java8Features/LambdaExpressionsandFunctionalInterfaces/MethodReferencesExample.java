package Java8Features.LambdaExpressionsandFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesExample {
    // Static method
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        List<String> messages = Arrays.asList("Hello", "World", "Method", "References", "in", "Java");

        // Using a method reference to a static method
        messages.forEach(MethodReferencesExample::printMessage);

        // Using a method reference to an instance method of an arbitrary object of a particular type
        messages.forEach(String::toUpperCase);

        // Output:
//        Hello
//        World
//        Method
//        References
//        in
//        Java
    }
}