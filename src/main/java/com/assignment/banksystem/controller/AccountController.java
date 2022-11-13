package com.assignment.banksystem.controller;
import com.assignment.banksystem.Repository.AccountRepo;
import com.assignment.banksystem.model.Account;
import com.assignment.banksystem.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class AccountController {
    @Autowired
    private AccountServiceImpl accountService;
    @GetMapping("/getting")
    public List<Account> getAllDetails(){
        return  this.accountService.totalAmount();
}
@PutMapping("/put/{lastDigitOfAccountNumber}")
public ResponseEntity<Account> deposited(@RequestBody Account account, @PathVariable("lastDigitOfAccountNumber") Integer lastDigitOfAccountNumber){
    try {
        Account acc1=this.accountService.getDeposite(account,account.getDepositAmount());
        return ResponseEntity.of(Optional.of(acc1));
    }catch (Exception e){
        e.printStackTrace();
    }
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    @PutMapping("/delete/{lastDigitOfAccountNumber}")
    public ResponseEntity<Account> withDraw(@RequestBody Account account, @PathVariable("lastDigitOfAccountNumber") Integer lastDigitOfAccountNumber) {
        try {
            Account acc2 = this.accountService.getWithDraw(account, account.getWithdrawAmount());
            return ResponseEntity.of(Optional.of(acc2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}

