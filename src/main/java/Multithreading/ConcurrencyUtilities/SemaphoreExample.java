package Multithreading.ConcurrencyUtilities;

// SemaphoreExample.java

import java.util.concurrent.Semaphore;

class SharedResource {
    private Semaphore semaphore = new Semaphore(2);

    public void accessResource(String threadName) {
        try {
            semaphore.acquire();
            System.out.println(threadName + " acquired semaphore.");
            Thread.sleep(1000);
            System.out.println(threadName + " released semaphore.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

class WorkerThread extends Thread {
    private SharedResource resource;

    public WorkerThread(SharedResource resource, String name) {
        super(name);
        this.resource = resource;
    }

    public void run() {
        resource.accessResource(this.getName());
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        WorkerThread t1 = new WorkerThread(resource, "Thread-1");
        WorkerThread t2 = new WorkerThread(resource, "Thread-2");
        WorkerThread t3 = new WorkerThread(resource, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output:
//        Thread-1 acquired semaphore.
//        Thread-3 acquired semaphore.
//        Thread-3 released semaphore.
//        Thread-2 acquired semaphore.
//        Thread-1 released semaphore.
//        Thread-2 released semaphore.
    }
}