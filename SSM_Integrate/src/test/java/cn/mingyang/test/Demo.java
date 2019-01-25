package cn.mingyang.test;

import cn.mingyang.domain.Account;
import cn.mingyang.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {
    @Test
    public void test01(){
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = (AccountService) ap.getBean("accountService");
        service.findAll();
    }

    /**
     * 测试事务是否执行
     */
    @Test
    public void test02(){
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = (AccountService) ap.getBean("accountService");
        service.saveAccount(new Account());
    }
}
