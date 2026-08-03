package IO.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            // Create a FileWriter object to write to a file
            FileWriter writer = new FileWriter("example.txt");

            // Write data to the file
            writer.write("Hello, this is an example of writing to a file.\n");
            writer.write("This is the second line.\n");

            // Close the FileWriter
            writer.close();

            System.out.println("Successfully wrote to the file."); // Output: Successfully wrote to the file.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}