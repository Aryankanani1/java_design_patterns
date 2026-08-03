package CoreJava.Oops;

public class ConstructorOverloadingExample {
    int id;
    String name;

    // Default constructor
    public ConstructorOverloadingExample() {
        this.id = 0;
        this.name = "Unknown";
    }

    // Parameterized constructor
    public ConstructorOverloadingExample(int id) {
        this.id = id;
        this.name = "Unknown";
    }

    // Parameterized constructor
    public ConstructorOverloadingExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display the details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Creating objects with different constructors
        ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample();
        ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(1);
        ConstructorOverloadingExample obj3 = new ConstructorOverloadingExample(2, "Alice");

        // Displaying the details
        obj1.display(); // ID: 0, Name: Unknown
        obj2.display(); // ID: 1, Name: Unknown
        obj3.display(); // ID: 2, Name: Alice
    }
}
