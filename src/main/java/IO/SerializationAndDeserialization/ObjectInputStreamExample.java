package IO.SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        // Deserialization code
        try {
            // Create a FileInputStream to read objects from the file "names.ser"
            FileInputStream fileIn = new FileInputStream("names.ser");

            // Create an ObjectInputStream to read objects from the FileInputStream
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            // Read the object from the ObjectInputStream and cast it to List<String>
            List<String> names = (List<String>) objectIn.readObject();

            // Close the ObjectInputStream
            objectIn.close();

            // Display the deserialized list of names
            System.out.println("Deserialized List of Names:"); // Output: Deserialized List of Names:
            for (String name : names) {
                System.out.println(name);
            }
           // Output:
//            Alice
//            Bob
//            Charlie

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}