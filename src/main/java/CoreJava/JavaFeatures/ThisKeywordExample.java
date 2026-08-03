package CoreJava.JavaFeatures;

public class ThisKeywordExample {
    // Instance variables
    int var1;
    int var2;

    // Constructor using 'this' keyword
    public ThisKeywordExample(int var1, int var2) {
        this.var1 = var1; // 'this' refers to the instance variable
        this.var2 = var2;
    }

    public void display() {
        System.out.println("var1: " + this.var1 + ", var2: " + this.var2);
    }

    public static void main(String[] args) {
        ThisKeywordExample example = new ThisKeywordExample(10, 20);
        example.display(); // Output: var1: 10, var2: 20
    }
}
