package com.examdans.services;

import com.examdans.contants.ResponseMessage;
import com.examdans.entities.Account;
import com.examdans.exceptions.UsernameAlreadyUsed;
import com.examdans.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Service
public class AccountServiceDbImpl implements AccountService{

  @Autowired
  AccountRepository accountRepository;

  @Autowired
  PasswordEncoder passwordEncoder;

  @Override
  public Account register(Account account) {
    if (accountRepository.existsByUsername(account.getUsername())) {
      throw new UsernameAlreadyUsed(String.format(ResponseMessage.USERNAME_ALREADY_USED, account.getUsername()));
    }
    account.setPassword(passwordEncoder.encode(account.getPassword()));
    return accountRepository.save(account);
  }

  @Override
  public List<Account> getAll() {
    return accountRepository.findAll();
  }
}
