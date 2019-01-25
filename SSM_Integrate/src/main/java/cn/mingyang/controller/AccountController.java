package cn.mingyang.controller;

import cn.mingyang.domain.Account;
import cn.mingyang.service.AccountService;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("fingAll")
    public String fingAll(ModelMap modelMap){
        List<Account> accounts = accountService.findAll();
        modelMap.addAttribute("list",accounts);
        System.out.println("Controller的方法执行了...");
        return "success";
    }
    @RequestMapping("saveAccount")
    public String saveAccount(Account account){

          accountService.saveAccount(account);

        return "success";
    }
}
