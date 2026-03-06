package Factories;

import Interfaces.Notification;
import NotificationTypes.EmailNotification;

public class EmailNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification(){
        return new EmailNotification();
    }
}
