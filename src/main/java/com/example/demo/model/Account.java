package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private Integer lastDigitOfAccountNumber;
    private String name;
    private double amount;

    public Account(Integer lastDigitOfAccountNumber, String name, double amount) {
        this.lastDigitOfAccountNumber = lastDigitOfAccountNumber;
        this.name = name;
        this.amount = amount;
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

    @Override
    public String toString() {
        return java.text.MessageFormat.format("LastDigitOfAccountNumber: {0}/t Name: {1}/t Amount: {2}/n",lastDigitOfAccountNumber,name,amount);
    }
}
