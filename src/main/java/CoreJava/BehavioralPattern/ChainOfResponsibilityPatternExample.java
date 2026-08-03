package CoreJava.BehavioralPattern;

// Handler interface
interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}

// Concrete Handler 1
class ConcreteHandler1 implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Handler1")) {
            System.out.println("Handled by ConcreteHandler1");
        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}

// Concrete Handler 2
class ConcreteHandler2 implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("Handler2")) {
            System.out.println("Handled by ConcreteHandler2");
        } else {
            if (next != null) {
                next.handleRequest(request);
            }
        }
    }
}

// Client
public class ChainOfResponsibilityPatternExample {
    public static void main(String[] args) {
        // Creating the chain of responsibility
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);

        // Making requests
        handler1.handleRequest("Handler1"); // Output: Handled by ConcreteHandler1
        handler1.handleRequest("Handler2"); // Output: Handled by ConcreteHandler2
        handler1.handleRequest("Unknown");
    }
}
