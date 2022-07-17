package com.example.base.repository;

import com.example.base.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Integer> {
        List<Account>  findAccountByUserFirstName(String firstName);
}
