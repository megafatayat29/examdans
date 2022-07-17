package com.examdans.services;

import com.examdans.entities.Account;
import com.examdans.entities.Job;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

public interface JobService {
  public JSONArray getAll() throws IOException, JSONException;
  public ResponseEntity<String> getJobString(String id) throws IOException;
}
