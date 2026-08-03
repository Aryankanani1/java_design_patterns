package Multithreading.SynchronizationandCommunication;

// NotifyAllExample.java

class SharedData {
    private boolean ready = false;

    public synchronized void produce() {
        ready = true;
        System.out.println("Produced data");
        notifyAll();
    }

    public synchronized void consume() {
        while (!ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed data");
    }
}

public class NotifyAllExample {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        Thread consumer1 = new Thread(data::consume);
        Thread consumer2 = new Thread(data::consume);
        Thread producer = new Thread(data::produce);

        consumer1.start();
        consumer2.start();
        producer.start();

        // Output:
        // Produced data
        // Consumed data
        // Consumed data
    }
}