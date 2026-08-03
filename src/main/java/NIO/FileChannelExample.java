package NIO;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelExample {
    public static void main(String[] args) {
        try {
            // Open a random access file in read-write mode
            RandomAccessFile file = new RandomAccessFile("example.txt", "rw");

            // Get the file channel
            FileChannel channel = file.getChannel();

            // Create a ByteBuffer
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            buffer.put("Hello, FileChannel!".getBytes());
            buffer.flip();

            // Write data from ByteBuffer to the file
            while (buffer.hasRemaining()) {
                channel.write(buffer);
            }

            // Close the channel and file
            channel.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}