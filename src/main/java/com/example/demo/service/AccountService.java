package com.example.demo.service;

import com.example.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountService {
    @Autowired
    private Account totalAccount;
    private static List<Account> account=new ArrayList<>();

    static {
        account.add(new Account(11, "Anushka", 10.00));
//        account.add(new Account(12, "Akshita", 20000.00));
//        account.add(new Account(13, "Anuj", 30000.00));
//        account.add(new Account(14, "Shivam", 40000.00));
//        account.add(new Account(15, "Shubham", 50000.00));
    }

    public List<Account> totalAmount() {
        return account;

    }


//    public Account getDeposite(Account account, double amount) {
//        account.setAmount(account.getAmount()+amount);
//        return account;
//    }
//
    public Account getDeposite(Account account, double amount) {
        System.out.println(amount);
        Double money=0.0+amount;
        account.setAmount(account.getAmount()+money);
        return account;
    }

}
