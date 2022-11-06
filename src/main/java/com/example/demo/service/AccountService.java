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
        account.add(new Account(11, "Anushka", 10.00,00.00,00.00));
    }

    public List<Account> totalAmount() {
        return account;

    }
    public Account getDeposite(Account account,double depositAmount) {
        Double money=0.0+depositAmount;
        account.setAmount(account.getAmount()+money);
        return account;
    }
    public Account getWithDraw(Account account, double withdraw) {
        Double money=0.0+withdraw;
        account.setAmount(account.getAmount()-money);
        return account;
    }

}
