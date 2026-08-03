package CoreJava.JavaFeatures;

public class ParameterizedConstructorExample {
    int var1;
    int var2;

    // Parameterized constructor
    public ParameterizedConstructorExample(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
        System.out.println("Parameterized constructor called.");
    }

    public void display() {
        System.out.println("var1: " + var1 + ", var2: " + var2);
    }

    public static void main(String[] args) {
        ParameterizedConstructorExample example = new ParameterizedConstructorExample(10, 20); // Output: Parameterized constructor called.
        example.display(); // Output: var1: 10, var2: 20
    }
}
