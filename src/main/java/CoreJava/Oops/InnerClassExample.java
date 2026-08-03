package CoreJava.Oops;

// Outer class
public class InnerClassExample {
    private String outerField = "Outer field";

    // Non-static inner class
    class Inner {
        void display() {
            System.out.println("Inner class accessing: " + outerField);
        }
    }

    // Static inner class
    static class StaticInner {
        void display() {
            System.out.println("Static inner class method.");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        InnerClassExample outer = new InnerClassExample();

        // Creating an instance of the non-static inner class
        InnerClassExample.Inner inner = outer.new Inner();
        inner.display(); // Output: Inner class accessing: Outer field

        // Creating an instance of the static inner class
        InnerClassExample.StaticInner staticInner = new InnerClassExample.StaticInner();
        staticInner.display(); // Output: Static inner class method.
    }
}
