package design_pattern.creational_patterns.factory_method.notification;
// concert product class
public class EmailNotification implements Notification{
    private final String emailAddress;

    public EmailNotification(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void send(String message) {
        System.out.println("email");
        System.out.println("to: "+emailAddress);
        System.out.println("message: "+message);
        System.out.println();
    }
}
