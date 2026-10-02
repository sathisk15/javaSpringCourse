package com.sk.store.exercise2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository users;
    private final NotificationService notificationService;

    public UserService(
            @Qualifier("email")
            NotificationService emailService,

            @Qualifier("sms")
            NotificationService smsService,

            @Value("${communication.preference}")
            String communicationPreference, UserRepository userRepository){
        this.users = userRepository;

        if(communicationPreference.equals("sms")){
            this.notificationService = smsService;
        } else this.notificationService = emailService;
//        this.notificationService = notificationService;
    }

    public void register(User user){
        users.save(user);
        notificationService.send("User Sucessfully Registered !", user.getEmail());
    }



}
