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

  OkHttpClient client = new OkHttpClient();

  @Override
  public JSONArray getAll() throws IOException, JSONException {
    String URL = "http://dev3.dansmultipro.co.id/api/recruitment/positions.json";
    Request request = new Request.Builder()
        .url(URL)
        .build();
    Response response = null;
    try {
      response = client.newCall(request).execute();
    } catch (IOException e) {
      e.printStackTrace();
    }
    String jsonData = response.body().string();
    JSONArray Jarray = new JSONArray(jsonData);

    for (int i = 0; i < Jarray.length(); i++) {
      JSONObject object     = Jarray.getJSONObject(i);
    }

    return Jarray;
  }

  @Autowired
  private RestTemplate restTemplate;

  public ResponseEntity<String> getJobString(String id) {
    ResponseEntity<String> response = restTemplate.getForEntity("http://dev3.dansmultipro.co.id/api/recruitment/positions/"+id, String.class);
    return response;
  }
}
