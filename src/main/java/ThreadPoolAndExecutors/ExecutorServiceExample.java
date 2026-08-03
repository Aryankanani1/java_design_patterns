package ThreadPoolAndExecutors;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        // Create a single thread executor
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit a callable task to the executor
        Future<String> future = executor.submit(new CallableTask());

        try {
            // Get the result of the task
            String result = future.get();
            System.out.println("Result from callable task: " + result); // Output: Result from callable task: Callable task completed!
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shut down the executor
        executor.shutdown();

        try {
            // Wait for all tasks to complete
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}

class CallableTask implements Callable<String> {
    public String call() throws Exception {
        Thread.sleep(2000); // Simulating some work
        return "Callable task completed!";
    }
}