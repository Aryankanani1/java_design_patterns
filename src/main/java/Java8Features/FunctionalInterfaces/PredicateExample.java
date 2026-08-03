package Java8Features.FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Predicate to check if a number is greater than 10
        Predicate<Integer> isGreaterThanTen = number -> number > 10;

        // Test the predicate
        int testNumber = 15;
        if (isGreaterThanTen.test(testNumber)) {
            System.out.println(testNumber + " is greater than 10"); // Output: 15 is greater than 10
        } else {
            System.out.println(testNumber + " is not greater than 10");
        }
    }
}