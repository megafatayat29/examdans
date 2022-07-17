package com.examdans.services;

import com.examdans.entities.Job;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Service
public class JobServiceDbImpl implements JobService {

  @Autowired
  private RestTemplate restTemplate;

  public ResponseEntity<Job> getJob(String id) {
      Job job = restTemplate.getForObject("http://dev3.dansmultipro.co.id/api/recruitment/positions/"+id, Job.class);
    return ResponseEntity.ok(job);
  }

  public ResponseEntity<Job[]> getAllJob() {
      ResponseEntity<Job[]> response = restTemplate.getForEntity("http://dev3.dansmultipro.co.id/api/recruitment/positions.json", Job[].class);
    return response;
  }
}
