package design_pattern.behavioural_pattern.mediator_pattern;
// chatMediator
public interface ChatMediator {
    void sendMessage(String message,User user);
    void addUser(User user);

}
