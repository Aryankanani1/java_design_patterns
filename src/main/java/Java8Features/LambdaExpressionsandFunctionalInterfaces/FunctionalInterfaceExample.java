package Java8Features.LambdaExpressionsandFunctionalInterfaces;

// Define a functional interface
@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (int a, int b) -> a + b;

        // Lambda expression for subtraction
        MathOperation subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        MathOperation multiplication = (a, b) -> a * b;

        // Lambda expression for division
        MathOperation division = (a, b) -> a / b;

        // Perform operations
        System.out.println("10 + 5 = " + operate(10, 5, addition)); // Output: 10 + 5 = 15
        System.out.println("10 - 5 = " + operate(10, 5, subtraction)); // Output: 10 - 5 = 5
        System.out.println("10 * 5 = " + operate(10, 5, multiplication)); // Output: 10 * 5 = 50
        System.out.println("10 / 5 = " + operate(10, 5, division)); // Output: 10 / 5 = 2
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}