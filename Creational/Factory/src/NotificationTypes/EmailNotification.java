package NotificationTypes;

import Interfaces.Notification;

public class EmailNotification implements  Notification{
    
    
    @Override
    public void sendMessage(String message){
        System.out.println(message + ": from sendMessage in eMail.");
    }
}
