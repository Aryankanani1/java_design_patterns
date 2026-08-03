package Java8Features.OptionalClass;

import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {
        OptionalClassExample example = new OptionalClassExample();

        // Create an Optional with a non-null value
        Optional<String> nonEmptyOptional = Optional.of("Hello, World!");
        System.out.println("Non-Empty Optional: " + nonEmptyOptional); // Output: Non-Empty Optional: Optional[Hello, World!]
        System.out.println("Value: " + nonEmptyOptional.get()); // Output: Value: Hello, World!

        // Create an Optional with a potentially null value
        Optional<String> nullableOptional = Optional.ofNullable(example.getNullableValue());
        System.out.println("Nullable Optional: " + nullableOptional); // Output: Nullable Optional: Optional.empty
        nullableOptional.ifPresent(value -> System.out.println("Value: " + value));

        // Create an Optional with an empty value
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Empty Optional: " + emptyOptional); // Output: Empty Optional: Optional.empty

        // Using orElse to provide a default value
        String defaultValue = nullableOptional.orElse("Default Value");
        System.out.println("Nullable Optional with Default Value: " + defaultValue); // Output: Nullable Optional with Default Value: Default Value

        // Using orElseGet to provide a default value using a Supplier
        defaultValue = emptyOptional.orElseGet(() -> "Default Value from Supplier");
        System.out.println("Empty Optional with Default Value: " + defaultValue); // Output: Empty Optional with Default Value: Default Value from Supplier

        // Using orElseThrow to throw an exception if the value is not present
        try {
            String value = emptyOptional.orElseThrow(() -> new IllegalArgumentException("Value is not present")); // Output: Exception: Value is not present
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // Method that returns a potentially null value
    public String getNullableValue() {
        // Return null for demonstration purposes
        return null;
    }
}