package design_pattern.behavioural_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public void setState(String state){
        this.state = state;
        notifyObservers();
    }

    public String getState(){
        return state;
    }
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }
}
