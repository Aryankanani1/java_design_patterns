package CoreJava.JavaFeatures;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // Append to StringBuilder
        sb.append(" World");
        System.out.println("Appended string: " + sb); // Output: Appended string: Hello World

        // Insert into StringBuilder
        sb.insert(6, "Beautiful ");
        System.out.println("String after insertion: " + sb); // Output: String after insertion: Hello Beautiful World

        // Replace in StringBuilder
        sb.replace(6, 15, "Amazing");
        System.out.println("String after replacement: " + sb); // Output: String after replacement: Hello Amazing World

        // Delete from StringBuilder
        sb.delete(6, 13);
        System.out.println("String after deletion: " + sb); // Output: String after deletion: Hello  World

        // Reverse the StringBuilder
        sb.reverse();
        System.out.println("Reversed string: " + sb); // Output: Reversed string: dlroW  olleH
    }
}
