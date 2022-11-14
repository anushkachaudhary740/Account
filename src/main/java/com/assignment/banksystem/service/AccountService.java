package com.assignment.banksystem.service;

import com.assignment.banksystem.model.AccountDetails;

import java.util.List;

public interface AccountService {
    List<AccountDetails> totalAmount();
    AccountDetails addDetails(AccountDetails account);
    AccountDetails getDeposit(AccountDetails account, Double depositeAmount);
    AccountDetails getWithDraw(AccountDetails account, Double withdraw);
}
