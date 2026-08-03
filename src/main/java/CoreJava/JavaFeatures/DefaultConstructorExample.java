package CoreJava.JavaFeatures;

public class DefaultConstructorExample {
    int var1;
    int var2;

    // Default constructor
    public DefaultConstructorExample() {
        var1 = 0;
        var2 = 0;
        System.out.println("Default constructor called.");
    }

    public void display() {
        System.out.println("var1: " + var1 + ", var2: " + var2);
    }

    public static void main(String[] args) {
        DefaultConstructorExample example = new DefaultConstructorExample(); // Output: Default constructor called.
        example.display(); // Output: var1: 0, var2: 0
    }
}
