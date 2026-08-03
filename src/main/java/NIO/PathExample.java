package NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        // Create a Path object using Paths.get()
        Path path = Paths.get("/home/user/example.txt");

        // Print information about the Path
        System.out.println("Filename: " + path.getFileName()); // Output: Filename: example.txt
        System.out.println("Parent directory: " + path.getParent()); // Output: Parent directory: \\home\\user
        System.out.println("Root component: " + path.getRoot()); // Output: Root component:
        System.out.println("Number of name elements in path: " + path.getNameCount()); // Output: Number of name elements in path: 3

        // Convert Path to absolute path
        Path absolutePath = path.toAbsolutePath();
        System.out.println("Absolute path: " + absolutePath); // Output: Absolute path: C:\\home\\user\\example.txt
    }
}