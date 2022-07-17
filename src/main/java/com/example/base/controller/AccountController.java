package com.example.base.controller;

import com.example.base.service.AccountService;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }
}
