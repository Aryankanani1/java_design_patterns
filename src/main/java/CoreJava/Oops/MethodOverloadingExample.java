package CoreJava.Oops;

public class MethodOverloadingExample {
    // Method with one parameter
    public void display(String name) {
        System.out.println("Name: " + name);
    }

    // Overloaded method with two parameters
    public void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of the class
        MethodOverloadingExample obj = new MethodOverloadingExample();

        // Calling the overloaded methods
        obj.display("John"); // Name: John
        obj.display("Jane", 25); // Name: Jane, Age: 25
    }
}
