package Java8Features.FunctionalInterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // BinaryOperator to add two integers
        BinaryOperator<Integer> add = (a, b) -> a + b;

        // Apply the binary operator
        int a = 5;
        int b = 10;
        int result = add.apply(a, b);
        System.out.println(a + " + " + b + " = " + result); // Output: 5 + 10 = 15
    }
}