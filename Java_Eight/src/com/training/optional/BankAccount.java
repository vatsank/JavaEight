package com.training.optional;

import java.util.Optional;

public class BankAccount {

	private long accountNumber;
	private String customerName;
	private Double overDraft;
	
	public BankAccount() {
		super();
	}

	public BankAccount(long accountNumber, String customerName, Double overDraft) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.overDraft = overDraft;
		
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(Double overDraft) {
		this.overDraft = overDraft;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", customerName=" + customerName + ", od=" + overDraft
				+ "]";
	}
	

	
}
