package com.sk.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("EMAIL")
@Primary
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message){
        System.out.println("Email Notification");
        System.out.println("Message: "+message);
    }
}
