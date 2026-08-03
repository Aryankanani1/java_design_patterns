package CoreJava.JavaFeatures;

public class StaticKeywordExample {
    // Static variable
    static int staticVar = 10;

    // Static method
    static void staticMethod() {
        System.out.println("Inside static method.");
    }

    // Instance variable
    int instanceVar;

    // Constructor to initialize instance variable
    public StaticKeywordExample(int instanceVar) {
        this.instanceVar = instanceVar;
    }

    public static void main(String[] args) {
        // Accessing static variable and method without creating an instance
        System.out.println("Static variable: " + StaticKeywordExample.staticVar); // Output: Static variable: 10
        StaticKeywordExample.staticMethod(); // Output: Inside static method.

        // Creating instance and accessing instance variable
        StaticKeywordExample example = new StaticKeywordExample(5);
        System.out.println("Instance variable: " + example.instanceVar); // Output: Instance variable: 5
    }
}
