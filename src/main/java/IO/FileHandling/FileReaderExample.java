package IO.FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            // Create a FileReader object to read from a file
            FileReader reader = new FileReader("example.txt");
            int character;

            // Read and print characters from the file
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            // Close the FileReader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}