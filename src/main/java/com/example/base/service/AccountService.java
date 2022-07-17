package com.example.base.service;

import com.example.base.model.Account;
import com.example.base.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Double countSum(String firstName) {
        List<Account> accounts = accountRepository.findAccountByUserFirstName(firstName);
        double s = accounts.stream().mapToDouble(a -> a.getSum()).sum();
        return s;
    }
}
