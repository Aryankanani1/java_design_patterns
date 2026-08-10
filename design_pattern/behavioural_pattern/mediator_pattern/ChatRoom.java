package design_pattern.behavioural_pattern.mediator_pattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    private List<User> userList;
    public ChatRoom(){
        this.userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for( User u :  this.userList){
        if(u != user){
            u.received(message);
        }
        }
    }

    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }
}
