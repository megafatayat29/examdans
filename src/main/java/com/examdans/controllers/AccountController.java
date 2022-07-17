package com.examdans.controllers;

import com.examdans.dto.UserCredentials;
import com.examdans.entities.Account;
import com.examdans.entities.Job;
import com.examdans.services.AccountService;
import com.examdans.services.AuthenticationTokenService;
import com.examdans.services.JobService;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.Map;

@RestController
public class AccountController {

  @Autowired
  AccountService accountService;

  @Autowired
  JobService jobService;

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

  @GetMapping("/jobs")
  public ResponseEntity<Job[]> getAll() throws IOException {
    return jobService.getAllJob();
  }

  @GetMapping("/job/{id}")
  public ResponseEntity<Job> findJobById(@PathVariable("id") String id) throws IOException {
    return jobService.getJob(id);
  }

}
