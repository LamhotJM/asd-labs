package edu.miu.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Account {
	public Account(Customer customer, String accountNumber, List<AccountEntry> entryList, AccountType accountType) {
		super();
		this.customer = customer;
		this.accountNumber = accountNumber;
		this.entryList = entryList;
		this.accountType = accountType;
	}

	private Customer customer;

	private String accountNumber;

	private List<AccountEntry> entryList = new ArrayList<AccountEntry>();
	public AccountType accountType;

	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		double balance = 0;
		for (AccountEntry entry : entryList) {
			balance += entry.getAmount();
		}
		return balance;
	}

	public void deposit(double amount) {
		AccountEntry entry = new AccountEntry(amount, "deposit", "", "");
		entryList.add(entry);
	}

	public void withdraw(double amount) {
		AccountEntry entry = new AccountEntry(-amount, "withdraw", "", "");
		entryList.add(entry);
	}

	private void addEntry(AccountEntry entry) {
		entryList.add(entry);
	}

	public void transferFunds(Account toAccount, double amount, String description) {
		AccountEntry fromEntry = new AccountEntry(-amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		AccountEntry toEntry = new AccountEntry(amount, description, toAccount.getAccountNumber(),
				toAccount.getCustomer().getName());
		
		entryList.add(fromEntry);
		
		toAccount.addEntry(toEntry);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Collection<AccountEntry> getEntryList() {
		return entryList;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
	
	public AccountType getAccountType() {
		return this.accountType;
	}
	
	public void addInterest() {
		// TODO Auto-generated method stub
		if (!getAccountType().equals(null)){
			double interest = getAccountType().computeInterest(getBalance());
			AccountEntry entry = new AccountEntry(interest, "Interest of user", getAccountNumber(), getCustomer().getName());
			entryList.add(entry);
		}
	}
	
	public double computeInterest() {
		return getAccountType().computeInterest(getBalance());
	}

}
