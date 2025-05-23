package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.integration.LoanAccountClient;
import com.example.demo.model.EmiDetail;
import com.example.demo.model.LoanAccount;
import com.example.demo.repository.LoanAccountRepository;

@Service
public class LoanAccountService {
    @Autowired
    private LoanAccountRepository repository;
    @Autowired
    private LoanAccountClient client;

    public LoanAccount getLoanAccount(String accountNumber) {
        LoanAccount loanAccount = client.fetchLoanAccount(accountNumber);
        for (EmiDetail detail : loanAccount.getEmiDetails()) {
            detail.setLoanAccount(loanAccount);
        }
        return repository.save(loanAccount);
    }
}
