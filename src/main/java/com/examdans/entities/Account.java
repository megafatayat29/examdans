package com.examdans.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "mst_account")
public class Account {
  public static final String entityName = "ACCOUNT";

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid")
  private String id;
  @NotBlank
  private String name;
  @NotBlank
  private String email;
  @NotBlank
  private String username;
  @NotBlank
  private String password;

  public Account() {
  }

  public Account(String name, String email, String password, String username) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.username = username;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getUsername() {
    return username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Account account = (Account) o;
    return Objects.equals(id, account.id) && Objects.equals(name, account.name) && Objects.equals(email, account.email) && Objects.equals(username, account.username) && Objects.equals(password, account.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, username, password);
  }
}
