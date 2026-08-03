package IO.FileHandling;

import java.io.File;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            // Create a File object
            File file = new File("example.txt");

            // Check if the file exists
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                // Create a new file
                if (file.createNewFile()) {
                    System.out.println("File created: " + file.getName()); // Output: File created: example.txt
                } else {
                    System.out.println("Failed to create the file.");
                }
            }

            // Get file information
            System.out.println("File name: " + file.getName()); // Output: File name: example.txt
            System.out.println("Absolute path: " + file.getAbsolutePath()); // Output: Absolute path: C:\Users\hsahu\Desktop\hungrycoder\hungrycoder\example.txt
            System.out.println("Writable: " + file.canWrite()); // Output: Writable: true
            System.out.println("Readable: " + file.canRead()); // Output: Readable: true
            System.out.println("File size in bytes: " + file.length()); // Output: File size in bytes: 0

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}