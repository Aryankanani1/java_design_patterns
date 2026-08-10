package design_pattern.behavioural_pattern.mediator_pattern;

public class ChatUser extends User{

    public ChatUser(ChatMediator chatMediator,String name) {
        super(chatMediator,name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " : sending message" + message);
        chatMediator.sendMessage(message,this);
    }

    @Override
    public void received(String message) {
        System.out.println(this.name + ": Received Message = " + message);
    }
}
