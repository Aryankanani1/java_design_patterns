package CoreJava.JavaFeatures;

public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // Append to StringBuffer
        sb.append(" World");
        System.out.println("Apended string: " + sb); // Output: Appended string: Hello World

        // Insert into StringBuffer
        sb.insert(6, "Beautiful ");
        System.out.println("String after insertion: " + sb); // Output: String after insertion: Hello Beautiful World

        // Replace in StringBuffer
        sb.replace(6, 16, "Amazing");
        System.out.println("String after replacement: " + sb); // Output: String after replacement: Hello AmazingWorld

        // Delete from StringBuffer
        sb.delete(6, 13);
        System.out.println("String after deletion: " + sb); // Output: String after deletion: Hello World

        // Reverse the StringBuffer
        sb.reverse();
        System.out.println("Reversed string: " + sb); // Output: Reversed string: dlroW olleH
    }
}
