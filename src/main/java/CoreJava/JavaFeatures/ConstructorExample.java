package CoreJava.JavaFeatures;

public class ConstructorExample {
    int var1;
    int var2;

    // Default constructor
    public ConstructorExample() {
        this.var1 = 0;
        this.var2 = 0;
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public ConstructorExample(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
        System.out.println("Parameterized constructor called.");
    }

    public void display() {
        System.out.println("var1: " + var1 + ", var2: " + var2);
    }

    public static void main(String[] args) {
        // Using default constructor
        ConstructorExample defaultExample = new ConstructorExample(); // Output: Default constructor called.
        defaultExample.display(); // Output: var1: 0, var2: 0

        // Using parameterized constructor
        ConstructorExample paramExample = new ConstructorExample(10, 20); // Output: Parameterized constructor called.
        paramExample.display(); // Output: var1: 10, var2: 20
    }
}
