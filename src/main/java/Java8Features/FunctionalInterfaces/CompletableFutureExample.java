package Java8Features.FunctionalInterfaces;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // Run a simple asynchronous task
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("Running an asynchronous task...");
        });

        // Wait for the task to complete
        try {
            future1.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Supply a result from an asynchronous task
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            return "Result from asynchronous task";
        });

        // Wait for the result and print it
        try {
            String result = future2.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Combine two futures
        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            return "Hello";
        });

        CompletableFuture<String> future4 = CompletableFuture.supplyAsync(() -> {
            return "World";
        });

        CompletableFuture<String> combinedFuture = future3.thenCombine(future4, (result1, result2) -> {
            return result1 + " " + result2;
        });

        // Wait for the combined result and print it
        try {
            String combinedResult = combinedFuture.get();
            System.out.println(combinedResult);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Handle exceptions in a future
        CompletableFuture<String> futureWithException = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Exception in asynchronous task");
            }
            return "This will not be returned";
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return "Default result after exception";
        });

        // Wait for the result and print it
        try {
            String result = futureWithException.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Output:
//        Running an asynchronous task...
//        Result from asynchronous task
//        Hello World
//        Exception: java.lang.RuntimeException: Exception in asynchronous task
//        Default result after exception
    }
}
