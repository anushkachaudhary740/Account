package com.assignment.banksystem.service;

import com.assignment.banksystem.model.Account;

public interface AccountService {
    Account getDeposite(Account account,Double depositeAmount);
    Account getWithDraw(Account account,Double withdraw);
}
