package CoreJava.BehavioralPattern;

import java.util.ArrayList;
import java.util.List;

// Mediator interface
interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

// Concrete Mediator
class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // Message should not be received by the user sending it
            if (u != user) {
                u.receive(message);
            }
        }
    }
}

// User class
abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}

// Concrete User
class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " received: " + message);
    }
}

// Client
public class MediatorPatternExample {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "John");
        User user2 = new UserImpl(mediator, "Jane");
        User user3 = new UserImpl(mediator, "Jack");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello, everyone!");

        // Output:
        // John sends: Hello, everyone!
        // Jane received: Hello, everyone!
        // Jack received: Hello, everyone!
    }
}
