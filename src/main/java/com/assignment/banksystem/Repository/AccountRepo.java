package com.assignment.banksystem.Repository;

import com.assignment.banksystem.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AccountRepo extends JpaRepository<BankAccount,Integer> {
    //public Optional<Account> findById(Integer id);
}
