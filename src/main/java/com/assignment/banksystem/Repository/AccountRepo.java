package com.assignment.banksystem.Repository;

import com.assignment.banksystem.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AccountRepo extends JpaRepository<Account,Integer> {
    //public Optional<Account> findById(Integer id);
}
