package Multithreading.BasicThreadOperations;

// ThreadExample.java

// Define a class that extends the Thread class
class MyThread extends Thread {
    // Override the run method to define the task
    public void run() {
        // Print a message indicating the thread is running
        System.out.println("Thread is running");
    }
}

// Main class to test MyThread
public class ThreadExample {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread t1 = new MyThread();

        // Start the thread
        t1.start(); // Output: Thread is running
    }
}
