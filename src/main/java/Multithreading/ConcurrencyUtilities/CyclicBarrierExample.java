package Multithreading.ConcurrencyUtilities;

// CyclicBarrierExample.java

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Task extends Thread {
    private CyclicBarrier barrier;

    public Task(CyclicBarrier barrier, String name) {
        super(name);
        this.barrier = barrier;
    }

    public void run() {
        System.out.println(this.getName() + " is waiting at the barrier");
        try {
            barrier.await();
            System.out.println(this.getName() + " crossed the barrier");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> System.out.println("All threads reached the barrier, let's proceed"));

        Task task1 = new Task(barrier, "Task-1");
        Task task2 = new Task(barrier, "Task-2");
        Task task3 = new Task(barrier, "Task-3");

        task1.start();
        task2.start();
        task3.start();

        // Output:
//        Task-1 is waiting at the barrier
//        Task-2 is waiting at the barrier
//        Task-3 is waiting at the barrier
//        All threads reached the barrier, let's proceed
//        Task-3 crossed the barrier
//        Task-1 crossed the barrier
//        Task-2 crossed the barrier
    }
}