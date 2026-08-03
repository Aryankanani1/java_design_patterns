package CoreJava.JavaFeatures;

class ParentClass {
    // Parent class constructor
    public ParentClass() {
        System.out.println("Parent class constructor.");
    }

    // Parent class method
    public void display() {
        System.out.println("Inside parent class method.");
    }
}

public class SuperKeywordExample extends ParentClass {
    // Child class constructor
    public SuperKeywordExample() {
        super(); // Calls parent class constructor
        System.out.println("Child class constructor.");
    }

    @Override
    public void display() {
        super.display(); // Calls parent class method
        System.out.println("Inside child class method.");
    }

    public static void main(String[] args) {
        SuperKeywordExample example = new SuperKeywordExample();
        example.display();

        // Output:
//        Parent class constructor.
//        Child class constructor.
//        Inside parent class method.
//        Inside child class method.
    }
}
