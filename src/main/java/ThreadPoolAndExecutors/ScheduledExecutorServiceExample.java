package ThreadPoolAndExecutors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        // Create a scheduled executor service with 1 thread
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule a task to run after a 3-second delay
        scheduler.schedule(new RunnableTask("Task 1"), 3, TimeUnit.SECONDS);

        // Schedule a task to run periodically every 5 seconds with an initial delay of 1 second
        scheduler.scheduleAtFixedRate(new RunnableTask("Task 2"), 1, 5, TimeUnit.SECONDS);

        // Schedule a task to run with a fixed delay of 4 seconds between the end of one execution and the start of the next
        scheduler.scheduleWithFixedDelay(new RunnableTask("Task 3"), 1, 4, TimeUnit.SECONDS);

        // Schedule the shutdown of the scheduler after 20 seconds
        scheduler.schedule(() -> {
            scheduler.shutdown();
            System.out.println("Scheduler shutdown initiated");
        }, 20, TimeUnit.SECONDS);
    }
}

class RunnableTask implements Runnable {
    private String taskName;

    public RunnableTask(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) " + taskName);
        processTask();
        System.out.println(Thread.currentThread().getName() + " (End) " + taskName);

        // Output:
//        pool-1-thread-1 (Start) Task 2
//        pool-1-thread-1 (End) Task 2
//        pool-1-thread-1 (Start) Task 3
//        pool-1-thread-1 (End) Task 3
//        pool-1-thread-1 (Start) Task 1
//        pool-1-thread-1 (End) Task 1
//        pool-1-thread-1 (Start) Task 2
//        pool-1-thread-1 (End) Task 2
//        pool-1-thread-1 (Start) Task 3
//        pool-1-thread-1 (End) Task 3
//        pool-1-thread-1 (Start) Task 2
//        pool-1-thread-1 (End) Task 2
//        pool-1-thread-1 (Start) Task 3
//        pool-1-thread-1 (End) Task 3
//        pool-1-thread-1 (Start) Task 2
//        pool-1-thread-1 (End) Task 2
//        Scheduler shutdown initiated
    }

    private void processTask() {
        try {
            Thread.sleep(2000); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}