package design_pattern.behavioural_pattern.chain_of_responsibility;

class ConcreteHandler1 extends AbstractHandler{
    public void handleRequest(String request) {
        if (request.equals("request1")) {
            System.out.println("ConcreteHandler1 is handling the request");
        } else if (handler != null) {
            handler.handleRequest(request);
        }
    }
}
