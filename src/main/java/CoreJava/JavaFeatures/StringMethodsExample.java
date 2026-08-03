package CoreJava.JavaFeatures;

public class StringMethodsExample {
    public static void main(String[] args) {
        // Creating a string
        String str = "Hello World";

        // Convert to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperStr); // Output: Uppercase: HELLO WORLD

        // Convert to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerStr); // Output: Lowercase: hello world

        // Check if string contains a substring
        boolean containsHello = str.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);// Output: Contains 'Hello': true

        // Replace characters in string
        String replacedStr = str.replace('l', 'p');
        System.out.println("Replaced 'l' with 'p': " + replacedStr);// Replaced 'l' with 'p': Heppo Worpd

        // Split string
        String[] parts = str.split(" ");
        System.out.println("Split string:");// Output: Split string:
        for (String part : parts) {
            System.out.println(part);
        }
        // Hello
        // World
    }
}

