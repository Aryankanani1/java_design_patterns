package CoreJava.BehavioralPattern;

import java.util.ArrayList;
import java.util.List;

// Subject
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Observer interface
abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

// Concrete Observer
class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}

// Client
public class ObserverPatternExample {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);

        System.out.println("First state change: 15"); // Output: First state change: 15
        subject.setState(15); // Output: Binary String: 1111
        System.out.println("Second state change: 10"); // Output: Second state change: 10
        subject.setState(10); // Output: Binary String: 1010
    }
}
