package Multithreading.ConcurrencyUtilities;

// ExchangerExample.java

import java.util.concurrent.Exchanger;

class Producer extends Thread {
    private Exchanger<String> exchanger;

    public Producer(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    public void run() {
        String data = "Data from Producer";
        try {
            System.out.println("Producer is exchanging data: " + data);
            data = exchanger.exchange(data);
            System.out.println("Producer received: " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private Exchanger<String> exchanger;

    public Consumer(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    public void run() {
        String data = "Data from Consumer";
        try {
            System.out.println("Consumer is exchanging data: " + data);
            data = exchanger.exchange(data);
            System.out.println("Consumer received: " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Producer producer = new Producer(exchanger);
        Consumer consumer = new Consumer(exchanger);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output:
//        Producer is exchanging data: Data from Producer
//        Consumer is exchanging data: Data from Consumer
//        Producer received: Data from Consumer
//        Consumer received: Data from Producer
    }
}