
// Authors: Shared responsibility
// Contribution: Notification system (confirmation emails, alerts)

import java.util.Date;

public class NotificationService {
    private String deliveryMode;
    private String message;

    public void send(Customer recipient, String content) {
        
    }

    public void schedule(Date sendAt) {
        
    }
}

//Author: Sowndharyaa (s4090884) below is the email service class - for emails as part of the notification
public class EmailService {
    public void sendEmail(String to, String message) {
        System.out.println("Email sent to " + to + ": " + message);
    }
}

