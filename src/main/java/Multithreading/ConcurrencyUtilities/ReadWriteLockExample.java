package Multithreading.ConcurrencyUtilities;

// ReadWriteLockExample.java

import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedData {
    private int data = 0;
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    // Method to write data with write lock
    public void writeData(int data) {
        lock.writeLock().lock();
        try {
            this.data = data;
            System.out.println("Written data: " + data);
        } finally {
            lock.writeLock().unlock();
        }
    }

    // Method to read data with read lock
    public int readData() {
        lock.readLock().lock();
        try {
            System.out.println("Read data: " + data);
            return data;
        } finally {
            lock.readLock().unlock();
        }
    }
}

class ReaderThread extends Thread {
    private SharedData sharedData;

    public ReaderThread(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedData.readData();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WriterThread extends Thread {
    private SharedData sharedData;

    public WriterThread(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedData.writeData(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ReadWriteLockExample {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        ReaderThread reader1 = new ReaderThread(sharedData);
        ReaderThread reader2 = new ReaderThread(sharedData);
        WriterThread writer = new WriterThread(sharedData);

        reader1.start();
        reader2.start();
        writer.start();

        try {
            reader1.join();
            reader2.join();
            writer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Output:
//    Read data: 0
//    Read data: 0
//    Written data: 0
//    Written data: 1
//    Read data: 1
//    Read data: 1
//    Read data: 1
//    Written data: 2
//    Read data: 2
//    Read data: 2
//    Written data: 3
//    Read data: 3
//    Read data: 3
//    Written data: 4
//    Read data: 4
}
