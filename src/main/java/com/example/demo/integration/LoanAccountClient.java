package com.example.demo.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.LoanAccount;

@Component
public class LoanAccountClient {
    
    private final RestTemplate restTemplate;
    
    public LoanAccountClient() {
        this.restTemplate = new RestTemplate();
    }
    
    public LoanAccount fetchLoanAccount(String accountNumber) {
        try {
            String url = "http://demo9993930.mockable.io/loanaccount/" + accountNumber;
            return restTemplate.getForObject(url, LoanAccount.class);
        } catch (Exception e) {
            throw new RuntimeException("Failed to fetch loan account data", e);
        }
    }
}