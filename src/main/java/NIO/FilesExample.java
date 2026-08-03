package NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) {
        try {
            // Read all lines from a file into a List<String>
            Path path = Paths.get("example.txt");
            List<String> lines = Files.readAllLines(path);

            // Print each line
            for (String line : lines) {
                System.out.println(line);
            }

            // Write lines to a new file
            Path newPath = Paths.get("newfile.txt");
            Files.write(newPath, lines);

            System.out.println("File operations completed successfully.");
            // Output:
//            Hello, FileChannel!of writing to a file using BufferedWriter.
//            BufferedWriter is used to provide efficient writing of characters.
//            File operations completed successfully.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}