package design_pattern.creational_patterns.factory_method.notification;
// concert creator class
public class SMSApplication extends NotificationCreation{
private final String phoneNumber;

    public SMSApplication(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public Notification createNotification() {
        return new EmailNotification(phoneNumber);
    }
}
