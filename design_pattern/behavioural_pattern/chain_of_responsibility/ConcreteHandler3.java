package design_pattern.behavioural_pattern.chain_of_responsibility;

class ConcreteHandler3 extends AbstractHandler{
    public void handleRequest(String request) {
        if (request.equals("request3")) {
            System.out.println("ConcreteHandler3 is handling the request");
        } else if (handler != null) {
            handler.handleRequest(request);
        }
    }
}

