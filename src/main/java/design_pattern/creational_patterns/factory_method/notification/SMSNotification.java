package design_pattern.creational_patterns.factory_method.notification;
// concert product class
public class SMSNotification implements Notification{
   private final String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        System.out.println("SMS");
        System.out.println("to:" +phoneNumber);
        System.out.println("message: " +message);
        System.out.println();
    }
}
