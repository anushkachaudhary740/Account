package com.assignment.banksystem.controller;
import com.assignment.banksystem.model.AccountDetails;
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
    @GetMapping("/get")
    public ResponseEntity<List<AccountDetails>> getAddress() {
        List<AccountDetails> list1 = null;
        try {
            list1 = this.accountService.totalAmount();
            if (list1.size() <= 0) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.of(Optional.of(list1));
    }
    @PostMapping("/post")
    public ResponseEntity<AccountDetails> postAccount(@RequestBody AccountDetails account) {
        AccountDetails add = null;
        try {
            add = this.accountService.addDetails(account);
            return ResponseEntity.of(Optional.of(add));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
@PutMapping("/add/{lastDigitOfAccountNumber}")
public ResponseEntity<AccountDetails> deposited(@RequestBody AccountDetails account, @PathVariable("lastDigitOfAccountNumber") Integer lastDigitOfAccountNumber){
    try {
        AccountDetails acc1=this.accountService.getDeposit(account,account.getDepositAmount());
        return ResponseEntity.of(Optional.of(acc1));
    }catch (Exception e){
        e.printStackTrace();
    }
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
    @PutMapping("/delete/{lastDigitOfAccountNumber}")
    public ResponseEntity<AccountDetails> withDraw(@RequestBody AccountDetails account, @PathVariable("lastDigitOfAccountNumber") Integer lastDigitOfAccountNumber) {
        try {
            AccountDetails acc2 = this.accountService.getWithDraw(account, account.getWithdrawAmount());
            return ResponseEntity.of(Optional.of(acc2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}

