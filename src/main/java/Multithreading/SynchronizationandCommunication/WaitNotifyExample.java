package Multithreading.SynchronizationandCommunication;

// WaitNotifyExample.java

class Message {
    private String message;

    public synchronized void produce(String message) {
        this.message = message;
        System.out.println("Produced: " + message);
        notify();
    }

    public synchronized void consume() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consumed: " + message);
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Message msg = new Message();

        Thread producer = new Thread(() -> {
            msg.produce("Hello, World!");
        });

        Thread consumer = new Thread(() -> {
            msg.consume();
        });

        consumer.start();
        producer.start();

        // Output:
        // Produced: Hello, World!
        // Consumed: Hello, World!
    }
}