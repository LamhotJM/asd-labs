package edu.miu.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.Collection;

public class AccountDAOImpl implements AccountDAO {
	Collection<Account> accountList = new ArrayList<Account>();

	public void saveAccount(Account account) {
		accountList.add(account);
	}

	public void updateAccount(Account account) {
		Account accountExist = loadAccount(account.getAccountNumber());
		if (accountExist != null) {
			accountList.remove(accountExist); 
			accountList.add(account);
		}

	}

	public Account loadAccount(String accountNumber) {
		for (Account account : accountList) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		return accountList;
	}

}
