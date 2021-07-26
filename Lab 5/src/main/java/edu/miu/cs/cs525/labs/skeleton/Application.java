package edu.miu.cs.cs525.labs.skeleton;

import edu.miu.cs.cs525.labs.command.CommandManager;
import edu.miu.cs.cs525.labs.command.DepositCommand;
import edu.miu.cs.cs525.labs.command.TransferCommand;
import edu.miu.cs.cs525.labs.command.WithdrawCommand;

/*
 * Lamhot Siagian
 * */

public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		DepositCommand depositCommand = new DepositCommand(accountService);
		WithdrawCommand withdrawCommand = new WithdrawCommand(accountService);
		TransferCommand transferFundsCommand = new TransferCommand(accountService);

		CommandManager management = new CommandManager();
		management.setDepositCommand(depositCommand);
		management.setWithdrawCommand(withdrawCommand);
		management.setTransferCommand(transferFundsCommand);

		Account user1 = accountService.createAccount("1263862", "Frank Brown");
		Account user2 = accountService.createAccount("4253892", "John Doe");

		management.deposit(user1.getAccountNumber(), 240);
		management.deposit(user1.getAccountNumber(), 529);
		management.withdraw(user1.getAccountNumber(), 230);
		management.deposit(user2.getAccountNumber(), 12450);
		management.transferFunds(user2.getAccountNumber(), user1.getAccountNumber(), 100, "payment of invoice 10232");

		management.deposit(user2.getAccountNumber(), 1000);
		management.undo();
		management.redo();
		management.redo();

		for (Account account : accountService.getAllAccounts()) {
			Customer customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountNumber());
			System.out.println("Account Holder: " + customer.getName());
			
			System.out.println("-Date-------------------------" 
					+ "-Description------------------" 
					+ "-Amount-------------");
			
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", 
						entry.getDate().toString(), 
						entry.getDescription(),
						entry.getAmount());
			}
			
			System.out.println("----------------------------------------" + "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:", account.getBalance());
		}
	}

}
