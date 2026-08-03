package CoreJava.BehavioralPattern;

import java.util.ArrayList;
import java.util.List;

// Memento
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// Originator
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}

// Caretaker
class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}

// Client
public class MementoPatternExample {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState()); // Output: Current State: State #4
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First saved State: " + originator.getState()); // Output: First saved State: State #2
        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Second saved State: " + originator.getState()); // Output: Second saved State: State #3
    }
}
