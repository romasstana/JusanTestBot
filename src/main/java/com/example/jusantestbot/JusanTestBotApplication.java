package com.example.jusantestbot;

import com.example.jusantestbot.Service.UsersService;
import com.example.jusantestbot.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JusanTestBotApplication {
    @Autowired
    private UsersService usersService;

    public static void main(String[] args) {
        SpringApplication.run(JusanTestBotApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
    private void testJpaMethods(){
        Users users = new Users();
        users.setUser_id(777L);
        users.setCompany_id(123456L);
        users.setChat_id(55555L);
        usersService.createUsers(users);
        Users users1 = new Users();
        users1.setUser_id(999L);
        users1.setCompany_id(1111111L);
        users1.setChat_id(987987987L);
        usersService.createUsers(users1);

    }
}
