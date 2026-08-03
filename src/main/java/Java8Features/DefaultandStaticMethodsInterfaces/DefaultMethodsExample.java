package Java8Features.DefaultandStaticMethodsInterfaces;

// Define the interface with a default method
interface MyInterface {
    // Abstract method (must be implemented by any class that implements this interface)
    void existingMethod(String str);

    // Default method (optional to implement, provides a default implementation)
    default void newDefaultMethod() {
        System.out.println("This is a default method in the interface.");
    }
}

// Implement the interface in a class
class MyClass implements MyInterface {
    // Implement the abstract method
    public void existingMethod(String str) {
        System.out.println("The string is: " + str); // Output: The string is: Hello, world!
    }

    // Optionally override the default method
    @Override
    public void newDefaultMethod() {
        System.out.println("Overridden default method in MyClass."); // Output: Overridden default method in MyClass.
    }
}

public class DefaultMethodsExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Call the implemented abstract method
        obj.existingMethod("Hello, world!");

        // Call the default method (will use the overridden version)
        obj.newDefaultMethod();
    }
}