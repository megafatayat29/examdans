package com.examdans.services;

import com.examdans.entities.Account;
import com.examdans.repositories.AccountRepository;
import com.examdans.security.UserDetailImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceDbImpl implements UserDetailsService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (!accountRepository.findAccountByUsername(username).isPresent()) {
            throw new UsernameNotFoundException("UserName Tidak Ditemukan!");
        }
        //Dari Database
        Account account = accountRepository.findAccountByUsername(username).get();

        List<GrantedAuthority> authorities = new ArrayList<>();

        UserDetails userDetails = new UserDetailImpl(account.getUsername(), account.getPassword(), authorities);
        return userDetails;
    }
}
