package Multithreading.BasicThreadOperations;

// ThreadPriorityExample.java

class MyPriorityThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running");
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create thread instances
        MyPriorityThread t1 = new MyPriorityThread();
        MyPriorityThread t2 = new MyPriorityThread();
        MyPriorityThread t3 = new MyPriorityThread();

        // Set thread names
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        // Set thread priorities
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        // Output:
//        Thread-2 with priority 5 is running
//        Thread-1 with priority 1 is running
//        Thread-3 with priority 10 is running
    }
}