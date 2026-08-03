package Java8Features.LambdaExpressionsandFunctionalInterfaces;

// Define a functional interface
@FunctionalInterface
interface GreetingService {
    void sayMessage(String message);
}

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        // Lambda expression with a single parameter
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        // Lambda expression with a block of code
        GreetingService greetService2 = message -> {
            System.out.println("Hello " + message);
            System.out.println("Welcome to lambda expressions in Java!");
        };

        // Call the method sayMessage of GreetingService
        greetService1.sayMessage("John");
        greetService2.sayMessage("Alice");

        // Output:
//        Hello John
//        Hello Alice
//        Welcome to lambda expressions in Java!
    }
}