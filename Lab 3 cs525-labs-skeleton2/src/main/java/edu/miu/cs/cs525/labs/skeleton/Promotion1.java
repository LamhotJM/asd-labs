package edu.miu.cs.cs525.labs.skeleton;

public class Promotion1 extends PromotionDecorator {
  Account account;
  public Promotion1(Account account){
    super(account.getAccountNumber());
    this.account = account;
  }

  @Override
  public double computeInterest() {
    double interest = account.computeInterest();
    return 0.01*interest + interest;
  }
}
