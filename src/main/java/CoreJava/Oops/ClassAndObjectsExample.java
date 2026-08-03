package CoreJava.Oops;

public class ClassAndObjectsExample {
    // Fields of the class
    int id;
    String name;

    // Constructor to initialize the object
    public ClassAndObjectsExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display the details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        // Creating an object of the class
        ClassAndObjectsExample obj = new ClassAndObjectsExample(1, "John Doe"); // ID: 1, Name: John Doe

        // Calling the method to display the details
        obj.display();
    }
}
