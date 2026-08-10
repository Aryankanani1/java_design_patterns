package design_pattern.behavioural_pattern.state_pattern;

public interface OrderState {
    void next(Order o);
    void cancel(Order o);


}
