package design_pattern.behavioural_pattern.state_pattern;

public class StatePattern {
    public static void main(String[] args) {
        Order o = new Order();
        o.next();
        o.next();
        o.next();
        o.cancel();
    }
}
