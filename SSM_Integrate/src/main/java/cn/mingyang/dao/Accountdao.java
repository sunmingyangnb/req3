package cn.mingyang.dao;

import cn.mingyang.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Accountdao {
    @Select("select *from Account")
    List<Account> findAll();
    @Insert("insert into Account values(null,#{name},#{money})")
    void saveAccount(Account account);

}
