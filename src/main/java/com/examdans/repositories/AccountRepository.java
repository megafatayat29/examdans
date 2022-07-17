package com.examdans.repositories;

import com.examdans.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
  public boolean existsByUsername(String username);
  public Optional<Account> findAccountByUsername(String username);
}
