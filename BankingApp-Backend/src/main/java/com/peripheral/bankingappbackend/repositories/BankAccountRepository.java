package com.peripheral.bankingappbackend.repositories;

import com.peripheral.bankingappbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
