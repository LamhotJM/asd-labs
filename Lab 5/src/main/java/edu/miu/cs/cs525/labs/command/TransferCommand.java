package edu.miu.cs.cs525.labs.command;

import edu.miu.cs.cs525.labs.command.Command;
import edu.miu.cs.cs525.labs.skeleton.Account;
import edu.miu.cs.cs525.labs.skeleton.AccountService;

public class TransferCommand implements Command {
  private AccountService accountService;
  private TransactionInfo transactionInfo;

  public TransferCommand(AccountService accountService) {
    this.accountService = accountService;
  }

  public void setTransactionInfo(TransactionInfo transactionInfo) {
    this.transactionInfo = transactionInfo;
  }

  @Override
  public void execute() {
    accountService.transferFunds(transactionInfo.getFromAccountNumber(), transactionInfo.getToAccountNumber(),
      transactionInfo.getAmount(), transactionInfo.getDescription());
  }

  @Override
  public void undo() {
    accountService.transferFunds(transactionInfo.getToAccountNumber(), transactionInfo.getFromAccountNumber(),
      transactionInfo.getAmount(), transactionInfo.getDescription());
  }
}
