package CoreJava.JavaFeatures;

public class FinalKeywordExample {
    // Final variable
    final int finalVar = 100;

    // Final method
    public final void finalMethod() {
        System.out.println("Inside final method.");
    }

    public static void main(String[] args) {
        FinalKeywordExample example = new FinalKeywordExample();
        System.out.println("Final variable: " + example.finalVar); // Output: Final variable: 100

        example.finalMethod(); // Output: Inside final method.
    }
}

// Uncommenting below code will cause a compile-time error
/*
class SubClass extends FinalKeywordExample {
    // Cannot override final method
    @Override
    public void finalMethod() {
        System.out.println("Trying to override final method.");
    }
}
*/
