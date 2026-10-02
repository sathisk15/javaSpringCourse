package com.sk.store.exercise1;

import org.springframework.stereotype.Service;

@Service("SMS")
public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String message){
        System.out.println("SMS Notification");
        System.out.println("Message: "+message);
    }
}
