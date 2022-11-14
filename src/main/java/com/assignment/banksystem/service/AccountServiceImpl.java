package com.assignment.banksystem.service;
import com.assignment.banksystem.Repository.AccountRepo;
import com.assignment.banksystem.model.AccountDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepo accountRepo;
    @Override
    public List<AccountDetails> totalAmount() {
        List<AccountDetails> list1=this.accountRepo.findAll();
        return list1;
    }
    @Override
    public AccountDetails addDetails(AccountDetails account){
       return this.accountRepo.save(account);
    }
    @Override
    public AccountDetails getDeposit(AccountDetails account, Double depositAmount) {
        Double money=0.0+depositAmount;
        account.setAmount(account.getAmount()+money);
        this.accountRepo.save(account);
        return account;
    }
    @Override
    public AccountDetails getWithDraw(AccountDetails account, Double withdraw) {
        Double money=0.0+withdraw;
        account.setAmount(account.getAmount()-money);
        this.accountRepo.save(account);
        return account;
    }
}
