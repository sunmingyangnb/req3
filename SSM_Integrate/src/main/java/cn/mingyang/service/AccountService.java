package cn.mingyang.service;

import cn.mingyang.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    void saveAccount(Account account);
}
