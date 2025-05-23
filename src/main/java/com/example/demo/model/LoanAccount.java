package com.example.demo.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class LoanAccount {
    @Id
    private String loanAccountNumber;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "loanAccount")
    private List<EmiDetail> emiDetails;

	public String getLoanAccountNumber() {
		return loanAccountNumber;
	}

	public void setLoanAccountNumber(String loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	public List<EmiDetail> getEmiDetails() {
		return emiDetails;
	}

	public void setEmiDetails(List<EmiDetail> emiDetails) {
		this.emiDetails = emiDetails;
	}
    

}