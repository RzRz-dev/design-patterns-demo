package NotificationTypes;

import Interfaces.Notification;

public class PushNotification implements Notification{

    @Override
    public void sendMessage(String message) {
        System.out.println(message + ": from sendMessage in Push.");
    }
    
}
