public class NotificationApp {
    public static void main(String[] args) {
        // Create a Notification reference variable named n
        Notification n;

        // Make n refer to an EmailNotification object and call send()
        n = new EmailNotification();
        n.send();

        // Make the same variable n refer to an SmsNotification object and call send()
        n = new SmsNotification();
        n.send();

        /*
         * Explanation:
         * The output changes due to runtime polymorphism (dynamic method dispatch). 
         * Even though the reference variable 'n' is of type Notification, Java determines 
         * which send() method to execute based on the actual object type created in memory 
         * at runtime (EmailNotification vs. SmsNotification), rather than the compile-time 
         * type of the reference variable.
         */
    }
}