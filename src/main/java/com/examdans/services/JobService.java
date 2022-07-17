package com.examdans.services;

import com.examdans.entities.Account;
import com.examdans.entities.Job;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

public interface JobService {
  public ResponseEntity<Job[]> getAllJob() throws IOException;
  public ResponseEntity<Job> getJob(String id) throws IOException;
}
