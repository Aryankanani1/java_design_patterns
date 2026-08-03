package IO.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            // Create a FileReader and wrap it in a BufferedReader
            FileReader fileReader = new FileReader("example.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read and print lines from the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            // Output:
//            Hello, this is an example of writing to a file.
//            This is the second line.

            // Close the BufferedReader and FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}