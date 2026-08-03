package Multithreading.SynchronizationandCommunication;

// ThreadCommunicationExample.java

class SharedResource {
    private boolean available = false;

    public synchronized void produce() {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Produced");
        available = true;
        notify();
    }

    public synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed");
        available = false;
        notify();
    }
}

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.produce();
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.consume();
        }
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();


        // Output:
        // Produced
        //Consumed
        //Produced
        //Consumed
        //Produced
        //Consumed
        //Produced
        //Consumed
        //Produced
        //Consumed
    }
}