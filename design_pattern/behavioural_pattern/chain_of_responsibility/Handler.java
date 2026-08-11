package design_pattern.behavioural_pattern.chain_of_responsibility;

public interface Handler {
    void handleRequest(String request);
    void setSuccessor(Handler successor);
}
