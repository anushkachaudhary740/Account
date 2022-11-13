package com.assignment.banksystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    @Column(name="account_number")
    private Integer lastDigitOfAccountNumber;
    private String name;
    private double amount;
    private double depositAmount;
    private double withdrawAmount;

    public Account(Integer lastDigitOfAccountNumber, String name, double amount,double depositAmount,double withdrawAmount) {
        this.lastDigitOfAccountNumber = lastDigitOfAccountNumber;
        this.name = name;
        this.amount = amount;
        this.depositAmount=depositAmount;
        this.withdrawAmount=withdrawAmount;
    }

    public Account() {
    }

    public Integer getLastDigitOfAccountNumber() {
        return lastDigitOfAccountNumber;
    }

    public void setLastDigitOfAccountNumber(Integer lastDigitOfAccountNumber) {
        this.lastDigitOfAccountNumber = lastDigitOfAccountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("LastDigitOfAccountNumber: {0}/t Name: {1}/t Amount: {2}/t DepositAmount: {3}/t WithdrawAmount: /n",lastDigitOfAccountNumber,name,amount,depositAmount,withdrawAmount);
    }
}
