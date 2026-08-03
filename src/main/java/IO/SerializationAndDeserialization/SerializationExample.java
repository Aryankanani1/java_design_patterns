package IO.SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// A Serializable class
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        // Create an object of the Student class
        Student student = new Student("John Doe", 20);

        // Serialization code
        try {
            // Create a FileOutputStream to write objects to a file named "student.ser"
            FileOutputStream fileOut = new FileOutputStream("student.ser");

            // Create an ObjectOutputStream to write objects to the FileOutputStream
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // Write the student object to the ObjectOutputStream
            objectOut.writeObject(student);

            // Close the ObjectOutputStream
            objectOut.close();

            // Inform user that serialization was successful
            System.out.println("Student object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Output: Student object serialized successfully.
    }
}