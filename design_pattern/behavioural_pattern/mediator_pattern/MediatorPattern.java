package design_pattern.behavioural_pattern.mediator_pattern;

public class MediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        User user1 = new ChatUser(chatRoom,"robert");
        User user2 = new ChatUser(chatRoom,"hulk");
        User user3 = new ChatUser(chatRoom,"thor");
        User user4 = new ChatUser(chatRoom,"sentry");
        User user5 = new ChatUser(chatRoom,"dr.doom");
        User user6 = new ChatUser(chatRoom,"beyondar");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);
        chatRoom.addUser(user5);
        chatRoom.addUser(user6);

        user1.send("hello");

    }
}
