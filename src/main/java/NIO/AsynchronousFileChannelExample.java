package NIO;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.Future;

public class AsynchronousFileChannelExample {
    public static void main(String[] args) {
        try {
            // Open an AsynchronousFileChannel
            Path path = Paths.get("example.txt");
            AsynchronousFileChannel channel = AsynchronousFileChannel.open(path,
                    StandardOpenOption.READ, StandardOpenOption.WRITE);

            // Create a ByteBuffer and read data asynchronously
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            long position = 0;
            Future<Integer> operation = channel.read(buffer, position);

            // Wait for the operation to complete
            while (!operation.isDone()) {
                // Do something else while waiting
            }

            // Flip the buffer to prepare for writing
            buffer.flip();

            // Write data asynchronously
            position = 0;
            Future<Integer> writeOperation = channel.write(buffer, position);

            // Wait for the write operation to complete
            while (!writeOperation.isDone()) {
                // Do something else while waiting
            }

            // Close the channel
            channel.close();

            System.out.println("File operations completed successfully.");
            // Output: File operations completed successfully.
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}