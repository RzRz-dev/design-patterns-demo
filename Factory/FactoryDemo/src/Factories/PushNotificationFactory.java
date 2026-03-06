package Factories;

import Interfaces.Notification;
import NotificationTypes.PushNotification;

public class PushNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification(){
        return new PushNotification();
    }
}