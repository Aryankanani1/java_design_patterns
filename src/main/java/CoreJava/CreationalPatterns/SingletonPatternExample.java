package CoreJava.CreationalPatterns;

// Singleton class
class Singleton {
    // Static variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Static method to get the single instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// Main class to test the Singleton pattern
public class SingletonPatternExample {
    public static void main(String[] args) {
        // Get the only object available
        Singleton singleton1 = Singleton.getInstance(); // Output: Singleton instance created
        Singleton singleton2 = Singleton.getInstance();

        // Check if both references point to the same instance
        System.out.println("Are both instances the same? " + (singleton1 == singleton2)); // Ouitput: Are both instances the same? true
    }
}
