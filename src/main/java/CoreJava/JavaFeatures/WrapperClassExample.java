package CoreJava.JavaFeatures;

public class WrapperClassExample {
    public static void main(String[] args) {
        // Autoboxing: Converting primitives into wrapper objects
        int intPrimitive = 5;
        Integer intWrapper = intPrimitive; // Autoboxing
        System.out.println("Integer wrapper: " + intWrapper); // Output: Integer wrapper: 5

        // Unboxing: Converting wrapper objects into primitives
        Integer anotherIntWrapper = new Integer(10);
        int anotherIntPrimitive = anotherIntWrapper; // Unboxing
        System.out.println("Primitive int: " + anotherIntPrimitive); // Output: Primitive int: 10

        // Using wrapper class methods
        String str = "123";
        int parsedInt = Integer.parseInt(str);
        System.out.println("Parsed int: " + parsedInt); // Output: Parsed int: 123

        // Using constants from wrapper classes
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE); // Output:Integer MAX_VALUE: 2147483647
        System.out.println("Double MIN_VALUE: " + Double.MIN_VALUE); // Double MIN_VALUE: 4.9E-324
    }
}
