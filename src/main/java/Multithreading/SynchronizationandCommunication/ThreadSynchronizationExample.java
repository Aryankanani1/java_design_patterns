package Multithreading.SynchronizationandCommunication;

// ThreadSynchronizationExample.java

class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Create multiple threads sharing the same Counter instance
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        // Start the threads
        t1.start();
        t2.start();

        // Wait for threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        System.out.println("Counter value: " + counter.getCount()); // Output: Counter value: 2000
    }
}