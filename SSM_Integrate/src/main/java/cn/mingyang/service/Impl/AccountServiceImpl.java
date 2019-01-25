package cn.mingyang.service.Impl;

import cn.mingyang.dao.Accountdao;
import cn.mingyang.domain.Account;
import cn.mingyang.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private JdbcTemplate jt;
    @Autowired
     private Accountdao accountdao;
    @Override
    public List<Account> findAll() {

        return accountdao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        accountdao.saveAccount(account);
        int i=1/0;
        accountdao.saveAccount(account);
  /*   jt.update("insert into Account values(null,'私立',20)");
     int i =1/0;
     jt.update("INSERT  INTO  Account VALUES (null,'私立',20)");*/
    }
}
