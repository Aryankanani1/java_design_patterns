package Multithreading.ConcurrencyUtilities;

// CountDownLatchExample.java

import java.util.concurrent.CountDownLatch;

class Worker extends Thread {
    private CountDownLatch latch;

    public Worker(CountDownLatch latch, String name) {
        super(name);
        this.latch = latch;
    }

    public void run() {
        System.out.println(this.getName() + " is working");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " finished work");
        latch.countDown();
    }
}

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Worker worker1 = new Worker(latch, "Worker-1");
        Worker worker2 = new Worker(latch, "Worker-2");
        Worker worker3 = new Worker(latch, "Worker-3");

        worker1.start();
        worker2.start();
        worker3.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All workers finished their tasks");

        // Output:
//        Worker-2 is working
//        Worker-3 is working
//        Worker-1 is working
//        Worker-2 finished work
//        Worker-3 finished work
//        Worker-1 finished work
//        All workers finished their tasks
    }
}