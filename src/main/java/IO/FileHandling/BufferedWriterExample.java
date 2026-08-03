package IO.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        // Declare FileWriter and BufferedWriter outside the try block
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            // Specify the file to write to
            String filename = "example.txt";

            // Create a FileWriter object with append mode set to false (overwrite mode)
            fileWriter = new FileWriter(filename, false);

            // Create a BufferedWriter object based on the FileWriter
            bufferedWriter = new BufferedWriter(fileWriter);

            // Write data to the file
            bufferedWriter.write("This is an example of writing to a file using BufferedWriter.\n");
            bufferedWriter.write("BufferedWriter is used to provide efficient writing of characters.\n");

            // Flush the BufferedWriter to ensure all data is written to the file
            bufferedWriter.flush();

            // Inform user that writing was successful
            System.out.println("Successfully wrote to the file using BufferedWriter.");
            // Output: Successfully wrote to the file using BufferedWriter.

        } catch (IOException e) {
            // Handle any exceptions that may occur
            e.printStackTrace();
        } finally {
            try {
                // Close the BufferedWriter and FileWriter in the finally block to ensure they are closed properly
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                // Handle any exceptions that may occur when closing the streams
                e.printStackTrace();
            }
        }
    }
}