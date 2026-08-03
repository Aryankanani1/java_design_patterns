package CallableAndFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {
    public static void main(String[] args) {
        // Create a callable task
        Callable<String> callableTask = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000); // Simulate some work
                return "FutureTask result";
            }
        };

        // Create a FutureTask from the callable
        FutureTask<String> futureTask = new FutureTask<>(callableTask);

        // Create an executor service
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit the FutureTask to the executor
        executor.submit(futureTask);

        // Do other tasks if needed

        // Get the result of the FutureTask
        try {
            String result = futureTask.get();
            System.out.println("Result from FutureTask: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        // Output:
//        Result from FutureTask: FutureTask result


        // Shut down the executor
        executor.shutdown();
    }
}
