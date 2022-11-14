package com.assignment.banksystem.service;
import com.assignment.banksystem.Repository.AccountRepo;
import com.assignment.banksystem.model.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepo accountRepo;
    @Override
    public List<BankAccount> totalAmount() {
        List<BankAccount> list1=this.accountRepo.findAll();
        return list1;
    }
    @Override
    public BankAccount addDetails(BankAccount account){
       return this.accountRepo.save(account);
    }
    @Override
    public BankAccount getDeposit(BankAccount account, Double depositAmount) {
        Double money=0.0+depositAmount;
        account.setInitialAmount(account.getInitialAmount()+money);
        this.accountRepo.save(account);
        return account;
    }
    @Override
    public BankAccount getWithDraw(BankAccount account, Double withdraw) {
        Double money=0.0+withdraw;
        account.setInitialAmount(account.getInitialAmount()-money);
        this.accountRepo.save(account);
        return account;
    }
}
