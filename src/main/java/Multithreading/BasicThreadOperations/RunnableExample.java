package Multithreading.BasicThreadOperations;

// RunnableExample.java

// Define a class that implements the Runnable interface
class MyRunnable implements Runnable {
    // Override the run method to define the task
    public void run() {
        // Print a message indicating the thread is running
        System.out.println("Thread is running using Runnable");
    }
}

// Main class to test MyRunnable
public class RunnableExample {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable runnable = new MyRunnable();

        // Create a Thread object and pass the Runnable instance
        Thread t1 = new Thread(runnable);

        // Start the thread
        t1.start(); // Output: Thread is running using Runnable
    }
}