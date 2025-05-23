package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmiDetail;
import com.example.demo.model.LoanAccount;
import com.example.demo.service.LoanAccountService;

@RestController
@RequestMapping("/api")
public class LoanAccountController {
    @Autowired
    private LoanAccountService service;

    @GetMapping("/loanaccount/{id}")
    public Map<String, Object> getLoanAccount(@PathVariable("id") String id) {
        LoanAccount account = service.getLoanAccount(id);

        Map<String, Object> response = new HashMap<>();
        response.put("loanAccountNumber", account.getLoanAccountNumber());
        response.put("emiAmount", account.getEmiDetails().stream().filter(EmiDetail::isDueStatus).findFirst().get().getEmiAmount());
        return response;
    }
}