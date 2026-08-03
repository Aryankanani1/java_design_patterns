package design_pattern.creational_patterns.factory_method.notification;
//creator class which contains the factory method
abstract class NotificationCreation {
    protected abstract Notification createNotification();
    // factory method
    public void sendNotification(String message){
        Notification notification = createNotification();
        notification.send(message);
    }

}
