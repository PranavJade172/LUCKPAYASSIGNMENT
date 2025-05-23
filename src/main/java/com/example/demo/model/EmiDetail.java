package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class EmiDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String month;
    private int emiAmount;
    private boolean paidStatus;
    private boolean dueStatus;

    @ManyToOne
    @JoinColumn(name = "loan_account_number")
    private LoanAccount loanAccount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(int emiAmount) {
		this.emiAmount = emiAmount;
	}

	public boolean isPaidStatus() {
		return paidStatus;
	}

	public void setPaidStatus(boolean paidStatus) {
		this.paidStatus = paidStatus;
	}

	public boolean isDueStatus() {
		return dueStatus;
	}

	public void setDueStatus(boolean dueStatus) {
		this.dueStatus = dueStatus;
	}

	public LoanAccount getLoanAccount() {
		return loanAccount;
	}

	public void setLoanAccount(LoanAccount loanAccount) {
		this.loanAccount = loanAccount;
	}

    
    
}