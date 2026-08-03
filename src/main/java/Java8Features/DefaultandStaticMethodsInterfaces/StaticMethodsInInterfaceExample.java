package Java8Features.DefaultandStaticMethodsInterfaces;

// Define the interface with a static method
interface MyStaticInterface {
    // Static method (can be called without an instance of the interface)
    static void staticMethod() {
        System.out.println("This is a static method in the interface."); // Output: This is a static method in the interface.
    }

    // Abstract method (must be implemented by any class that implements this interface)
    void instanceMethod();
}

// Implement the interface in a class
class MyStaticClass implements MyStaticInterface {
    // Implement the abstract method
    public void instanceMethod() {
        System.out.println("This is an instance method in MyStaticClass."); // Output: This is an instance method in MyStaticClass.
    }
}

public class StaticMethodsInInterfaceExample {
    public static void main(String[] args) {
        // Call the static method directly from the interface
        MyStaticInterface.staticMethod();

        // Create an instance of the implementing class
        MyStaticClass obj = new MyStaticClass();

        // Call the instance method
        obj.instanceMethod();
    }
}