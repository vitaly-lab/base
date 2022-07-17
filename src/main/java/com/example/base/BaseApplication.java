package com.example.base;

import com.example.base.controller.UserController;
import com.example.base.repository.UserRepository;
import com.example.base.service.AccountService;
import com.example.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class BaseApplication {

    @Autowired
    private UserService userService;
    @Autowired
    private AccountService accountService;


    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    private void testJpaMethods() {
        userService.findUserByFirstName("Jaroslav")
                .forEach(it -> System.out.println(it.getFirstName() + " " + it.getLastName()));
        System.out.println("Total sum for firstname Jaroslav" + " " + accountService.countSum("Jaroslav"));
    }
}
