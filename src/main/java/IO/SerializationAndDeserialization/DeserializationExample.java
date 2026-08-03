package IO.SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        // Deserialization code
        try {
            // Create a FileInputStream to read objects from the file "student.ser"
            FileInputStream fileIn = new FileInputStream("student.ser");

            // Create an ObjectInputStream to read objects from the FileInputStream
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            // Read the object from the ObjectInputStream and cast it to Student class
            Student student = (Student) objectIn.readObject();

            // Close the ObjectInputStream
            objectIn.close();

            // Display the deserialized object's details
            System.out.println("Deserialized Student:"); // Output: Deserialized Student:
            System.out.println("Name: " + student.getName()); // Output: Name: John Doe
            System.out.println("Age: " + student.getAge()); // Output: Age: 20

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}