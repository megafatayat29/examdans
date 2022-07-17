package com.examdans.entities;

import javax.persistence.Entity;

//@Entity
public class Job {
  private String id;
  private String type;
  private String url;
  private String created_at;
  private String company;
  private String company_url;
  private String location;
  private String title;
  private String description;
  private String how_to_apply;
  private String company_logo;

  public Job(String type, String url, String created_at, String company, String company_url, String location, String title, String description, String how_to_apply, String company_logo) {
    this.type = type;
    this.url = url;
    this.created_at = created_at;
    this.company = company;
    this.company_url = company_url;
    this.location = location;
    this.title = title;
    this.description = description;
    this.how_to_apply = how_to_apply;
    this.company_logo = company_logo;
  }

  public String getType() {
    return type;
  }

  public String getUrl() {
    return url;
  }

  public String getCreated_at() {
    return created_at;
  }

  public String getCompany() {
    return company;
  }

  public String getCompany_url() {
    return company_url;
  }

  public String getLocation() {
    return location;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public String getHow_to_apply() {
    return how_to_apply;
  }

  public String getCompany_logo() {
    return company_logo;
  }
}
