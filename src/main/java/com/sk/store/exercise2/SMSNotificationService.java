package com.sk.store.exercise2;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Recipient: "+recipientEmail);
        System.out.println("message: "+ message);
        System.out.println("SMS Sent !");
    }
}
