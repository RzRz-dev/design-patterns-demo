package NotificationTypes;
import Interfaces.Notification;

public class SmsNotification implements Notification{

    @Override
    public void sendMessage(String message) {
        System.out.println(message + ": from sendMessage in SMS.");
    }
        
}
