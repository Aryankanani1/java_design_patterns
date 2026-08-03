package NIO;

import java.nio.IntBuffer;

public class BufferExample {
    public static void main(String[] args) {
        // Create a IntBuffer with capacity 5
        IntBuffer buffer = IntBuffer.allocate(5);

        // Add data to the buffer
        for (int i = 1; i <= buffer.capacity(); i++) {
            buffer.put(i * 2);
        }

        // Flip the buffer to prepare for reading
        buffer.flip();

        // Read data from the buffer
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
       // Output:
//        2
//        4
//        6
//        8
//        10
    }
}