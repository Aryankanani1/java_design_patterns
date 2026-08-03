package Multithreading.BasicThreadOperations;

// ThreadLifecycleExample.java

class MyLifecycleThread extends Thread {
    public void run() {
        System.out.println("Thread is running");

        // Simulate some work with sleep
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }

        System.out.println("Thread is terminating");
    }
}

public class ThreadLifecycleExample {
    public static void main(String[] args) {
        // Thread in New state
        MyLifecycleThread t1 = new MyLifecycleThread();

        // Thread in Runnable state after calling start
        t1.start(); // Output: Thread is running

        // Check thread state
        System.out.println("Thread state after start: " + t1.getState()); // Output: Thread state after start: RUNNABLE

        // Wait for the thread to terminate
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output: Thread is terminating

        // Thread in Terminated state
        System.out.println("Thread state after completion: " + t1.getState());
        // Output: Thread state after completion: TERMINATED
    }
}