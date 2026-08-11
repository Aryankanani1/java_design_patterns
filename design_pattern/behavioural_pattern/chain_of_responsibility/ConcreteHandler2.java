package design_pattern.behavioural_pattern.chain_of_responsibility;

class ConcreteHandler2 extends AbstractHandler{
    public void handleRequest(String request) {
        if (request.equals("request2")) {
            System.out.println("ConcreteHandler2 is handling the request");
        } else if (handler != null) {
            handler.handleRequest(request);
        }
    }
}

