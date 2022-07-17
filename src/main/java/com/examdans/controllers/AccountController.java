package com.examdans.controllers;

import com.examdans.dto.UserCredentials;
import com.examdans.entities.Account;
import com.examdans.services.AccountService;
import com.examdans.services.AuthenticationTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@RestController
public class AccountController {

  @Autowired
  AccountService accountService;

  @Autowired
  AuthenticationTokenService authenticationTokenService;

  @PostMapping("/register")
  public Account register(@Valid @RequestBody Account account) {
    return accountService.register(account);
  }

  @PostMapping("/signIn")
  public Map<String, Object> signIn(@Valid @RequestBody UserCredentials userCredentials) {
    return authenticationTokenService.signIn(userCredentials);
  }
}
