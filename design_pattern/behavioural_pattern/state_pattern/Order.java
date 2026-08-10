package design_pattern.behavioural_pattern.state_pattern;

public class Order {
    private OrderState orderState = new NewOrderState();

    public void setOrderState(OrderState orderState){
        this.orderState = orderState;
    }

    public void next(){
        orderState.next(this);
    }

    public void cancel(){
        orderState.cancel(this);
    }
}
