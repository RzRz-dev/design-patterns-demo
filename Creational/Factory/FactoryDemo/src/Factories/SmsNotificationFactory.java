package Factories;

import Interfaces.Notification;
import NotificationTypes.SmsNotification;

public class SmsNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification(){
        return new SmsNotification();

    }
}
