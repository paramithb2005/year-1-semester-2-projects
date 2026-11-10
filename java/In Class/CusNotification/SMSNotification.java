public class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending an email");
    }
}

public class SmsNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending an SMS");
    }
}