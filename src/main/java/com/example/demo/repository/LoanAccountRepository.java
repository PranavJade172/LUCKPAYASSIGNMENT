package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoanAccount;

public interface LoanAccountRepository extends JpaRepository<LoanAccount, String> {
}
