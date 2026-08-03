package ThreadPoolAndExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit runnable tasks for execution
        for (int i = 1; i <= 5; i++) {
            Runnable worker = new WorkerThread("Task " + i);
            executor.execute(worker);
        }

        // Shut down the executor
        executor.shutdown();

        // Wait for all tasks to finish
        while (!executor.isTerminated()) {
        }

        System.out.println("All tasks are finished!");
    }
}

class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (End) " + message);
    }

    private void processMessage() {
        try {
            Thread.sleep(2000); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output:
//        pool-1-thread-1 (Start) Task 1
//        pool-1-thread-3 (Start) Task 3
//        pool-1-thread-2 (Start) Task 2
//        pool-1-thread-1 (End) Task 1
//        pool-1-thread-2 (End) Task 2
//        pool-1-thread-3 (End) Task 3
//        pool-1-thread-2 (Start) Task 4
//        pool-1-thread-1 (Start) Task 5
//        pool-1-thread-2 (End) Task 4
//        pool-1-thread-1 (End) Task 5
//        All tasks are finished!
    }
}