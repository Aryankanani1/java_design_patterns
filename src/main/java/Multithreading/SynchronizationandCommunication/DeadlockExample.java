package Multithreading.SynchronizationandCommunication;

// DeadlockExample.java

class Resource {
    public synchronized void method1(Resource resource) {
        System.out.println(Thread.currentThread().getName() + " is executing method1");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resource.method2(this);
    }

    public synchronized void method2(Resource resource) {
        System.out.println(Thread.currentThread().getName() + " is executing method2");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resource.method1(this);
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread t1 = new Thread(() -> resource1.method1(resource2), "Thread-1");
        Thread t2 = new Thread(() -> resource2.method1(resource1), "Thread-2");

        t1.start();
        t2.start();
        // Output:
//        Thread-2 is executing method1
//        Thread-1 is executing method1
    }
}