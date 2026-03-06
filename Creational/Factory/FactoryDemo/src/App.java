
import Factories.EmailNotificationFactory;
import Factories.NotificationFactory;
import Interfaces.Notification;

public class App {
    public static void main(String[] args) throws Exception {
        NotificationFactory creator = new EmailNotificationFactory();
        Notification notification = creator.createNotification();
        notification.sendMessage("Hello world");
    }
}
