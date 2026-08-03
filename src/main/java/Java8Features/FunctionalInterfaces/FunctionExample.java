package Java8Features.FunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Function to convert a string to its length
        Function<String, Integer> stringLength = str -> str.length();

        // Apply the function
        String testString = "Hello, World!";
        int length = stringLength.apply(testString);
        System.out.println("The length of \"" + testString + "\" is " + length); // Output: The length of "Hello, World!" is 13
    }
}