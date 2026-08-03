package Java8Features.FunctionalInterfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier to provide a new String
        Supplier<String> stringSupplier = () -> "Hello, World!";

        // Get the supplied value
        String suppliedString = stringSupplier.get();
        System.out.println(suppliedString); // Output: Hello, World!
    }
}