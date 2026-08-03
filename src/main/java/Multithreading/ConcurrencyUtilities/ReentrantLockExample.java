package Multithreading.ConcurrencyUtilities;

// ReentrantLockExample.java

import java.util.concurrent.locks.ReentrantLock;

class SharedCounter {
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private SharedCounter counter;

    public CounterThread(SharedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter value: " + counter.getCount()); // Output: Counter value: 2000
    }
}
