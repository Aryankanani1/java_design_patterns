package design_pattern.creational_patterns.factory_method.notification;
// concert creator class
public class EmailApplication extends NotificationCreation{
    private final String emailAddress;

    public EmailApplication(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public Notification createNotification() {
        return new EmailNotification(emailAddress);
    }
}
