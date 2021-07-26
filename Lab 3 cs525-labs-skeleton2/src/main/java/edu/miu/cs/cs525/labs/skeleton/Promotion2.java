package edu.miu.cs.cs525.labs.skeleton;

public class Promotion2 extends PromotionDecorator {
  Account account;
  public Promotion2(Account account){
    super(account.getAccountNumber());
    this.account = account;
  }

  @Override
  public double computeInterest() {
    double interest = account.computeInterest();
    return 0.02*interest + interest;
  }
}
