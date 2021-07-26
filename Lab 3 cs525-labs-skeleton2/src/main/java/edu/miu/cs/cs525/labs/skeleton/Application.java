package edu.miu.cs.cs525.labs.skeleton;

// Lamhot Siagian
public class Application {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();

		Account account1 = accountService.createAccount("1263862", "Frank Brown");
		account1.setAccountType(new CheckingAccount());

		Account account2 = accountService.createAccount("4253892", "John Doe");
		account2.setAccountType(new SavingAccount());
		accountService.deposit("1263862", 240);
		accountService.deposit("1263862", 529);
		accountService.withdraw("1263862", 230);
		accountService.deposit("4253892", 12450);
		accountService.transferFunds("4253892", "1263862", 100, "payment of invoice 10232");
		
		
		accountService.addInterestAccounts();
		
		account1 = new Promotion1(account1);
		System.out.println("Account 1.1 after promotion Interest : " + account1.computeInterest());
		account1 = new Promotion2(account1);
		System.out.println("Account 1.2 after promotion Interest: " + account1.computeInterest());
		account1 = new Promotion3(account1);
		System.out.println("Account 1.3 after promotion Interest: " + account1.computeInterest());
		account1 = new Promotion1(account1);
		System.out.println("Account 1.4 after promotion Interest: " + account1.computeInterest());

		account2 = new Promotion1(account2);
		System.out.println("Account 2.1 after promotion Interest: "+  account2.computeInterest());
		account2 = new Promotion2(account2);
		System.out.println("Account 2.2 after promotion Interest: "+  account2.computeInterest());
		account2 = new Promotion3(account2);
		System.out.println("Account 2.3 after promotion Interest: "+  account2.computeInterest());
		
		System.out.println("Account 2.3 after promotion Interest: "+  account2.getCustomer());
		
		
		System.out.printf("\n");

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
