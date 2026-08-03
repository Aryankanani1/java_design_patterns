package Java8Features.FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        // UnaryOperator to increment an integer
        UnaryOperator<Integer> increment = x -> x + 1;

        // Apply the unary operator
        int value = 5;
        int incrementedValue = increment.apply(value);
        System.out.println("Incremented value of " + value + " is " + incrementedValue); // Output: Incremented value of 5 is 6
    }
}