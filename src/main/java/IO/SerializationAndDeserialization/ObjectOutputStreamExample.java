package IO.SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        // List of objects to be serialized
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Serialization code
        try {
            // Create a FileOutputStream to write objects to a file named "names.ser"
            FileOutputStream fileOut = new FileOutputStream("names.ser");

            // Create an ObjectOutputStream to write objects to the FileOutputStream
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            // Write the list of names to the ObjectOutputStream
            objectOut.writeObject(names);

            // Close the ObjectOutputStream
            objectOut.close();

            // Inform user that serialization was successful
            System.out.println("List of names serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Output: List of names serialized successfully.
    }
}