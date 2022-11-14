package com.assignment.banksystem.service;

import com.assignment.banksystem.model.BankAccount;

import java.util.List;

public interface AccountService {
    List<BankAccount> totalAmount();
    BankAccount addDetails(BankAccount account);
    BankAccount getDeposit(BankAccount account, Double depositeAmount);
    BankAccount getWithDraw(BankAccount account, Double withdraw);
}
