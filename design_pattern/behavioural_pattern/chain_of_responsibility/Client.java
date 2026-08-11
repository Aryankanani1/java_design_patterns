package design_pattern.behavioural_pattern.chain_of_responsibility;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        handler1.handleRequest("request1");
        handler1.handleRequest("request2");
        handler1.handleRequest("request3");
    }
}
