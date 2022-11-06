package com.example.demo.controller;

import com.example.demo.model.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping("/getting")
    public List<Account> getAllDetails(){
    return  this.accountService.totalAmount();
}
@PutMapping("/put/{lastDigitOfAccountNumber}")
public Account deposited(@RequestBody Account account, @PathVariable("lastDigitOfAccountNumber") Integer lastDigitOfAccountNumber){
    //System.out.println(account.getAmount());
    return this.accountService.getDeposite(account,account.getDepositAmount());

}
    @PutMapping("/delete/{lastDigitOfAccountNumber}")
    public Account withDraw(@RequestBody Account account, @PathVariable("lastDigitOfAccountNumber") Integer lastDigitOfAccountNumber){
        //System.out.println(account.getAmount());
        return this.accountService.getWithDraw(account,account.getWithdrawAmount());

    }
}
