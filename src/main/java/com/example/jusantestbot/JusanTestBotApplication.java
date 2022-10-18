package com.example.jusantestbot;

import com.example.jusantestbot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JusanTestBotApplication {

    public static void main(String[] args) {
        System.getProperties().put("proxySet", "true");

        System.getProperties().put("socksProxyHost", "127.0.0.1");

        System.getProperties().put("socksProxyPort", "9150");
        SpringApplication.run(JusanTestBotApplication.class, args);
    }

}
