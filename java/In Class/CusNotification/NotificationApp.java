public class NotificationApp {
    public static void main(String[] args) {
        
        Notification n;

        
        n = new EmailNotification();
        n.send();

        
        n = new SmsNotification();
        n.send();

        
    }
}