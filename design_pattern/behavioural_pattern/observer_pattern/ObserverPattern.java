package design_pattern.behavioural_pattern.observer_pattern;

public class ObserverPattern {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("observer1",concreteSubject);
        ConcreteObserver observer2 = new ConcreteObserver("observer2",concreteSubject);

        concreteSubject.setState("state 1");
        concreteSubject.setState("state 2");

        concreteSubject.detach(observer1);

        concreteSubject.setState("state 3");

    }
}
