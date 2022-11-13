package com.assignment.banksystem.service;

import com.assignment.banksystem.Repository.AccountRepo;
import com.assignment.banksystem.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountServiceImpl implements AccountService {
    @Autowired
    private Account totalAccount;
    @Autowired
    private AccountRepo accountRepo;
    private static List<Account> account=new ArrayList<>();

    static {
        account.add(new Account(11, "Anushka", 10.00,00.00,00.00));
    }

    public List<Account> totalAmount() {
        List<Account> list1=this.accountRepo.findAll();
        return list1;
    }
    @Override
    public Account getDeposite(Account account, Double depositeAmount) {
        Double money=0.0+depositeAmount;
        account.setAmount(account.getAmount()+money);
        this.accountRepo.save(account);
        return account;
    }
    @Override
    public Account getWithDraw(Account account, Double withdraw) {
        Double money=0.0+withdraw;
        account.setAmount(account.getAmount()-money);
        return account;
    }
}
