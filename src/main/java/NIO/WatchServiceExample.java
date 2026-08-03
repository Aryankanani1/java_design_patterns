package NIO;

import java.nio.file.*;

public class WatchServiceExample {
    public static void main(String[] args) {
        try {
            // Create a WatchService
            WatchService watchService = FileSystems.getDefault().newWatchService();

            // Register a directory with the WatchService
            Path directory = Paths.get("C:\\Users\\hsahu\\Desktop\\hungrycoder\\hungrycoder\\src\\main\\java\\NIO");
            directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);

            // Infinite loop to watch for events
            while (true) {
                WatchKey key = watchService.take(); // Wait for a key
                for (WatchEvent<?> event : key.pollEvents()) {
                    // Print out event kind and context
                    System.out.println("Event kind:" + event.kind() + ". File affected: " + event.context() + ".");
                }
                key.reset(); // Reset key
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}