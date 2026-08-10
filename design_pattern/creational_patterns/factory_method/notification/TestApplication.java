package design_pattern.creational_patterns.factory_method.notification;

public class TestApplication {

    public static void main(String[] args) {


        NotificationCreation notificationCreation = new EmailApplication("aryan2111@example.com");
        notificationCreation.sendNotification("thank you for subscription");

        NotificationCreation notificationCreation1 = new SMSApplication("1-800-GOT-ROTE");
        notificationCreation1.sendNotification("your opt is xxx11");

    }

}
