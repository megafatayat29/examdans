package com.examdans.services;

import com.examdans.entities.Account;

import java.util.List;

public interface AccountService {
  public Account register(Account account);
  public List<Account> getAll();
}
