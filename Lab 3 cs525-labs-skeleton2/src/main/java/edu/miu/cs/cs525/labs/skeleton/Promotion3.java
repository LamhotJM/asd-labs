package edu.miu.cs.cs525.labs.skeleton;

public class Promotion3 extends PromotionDecorator {
  Account account;
  public Promotion3(Account account){
    super(account.getAccountNumber());
    this.account = account;
  }

  @Override
  public double computeInterest() {
    double interest = account.computeInterest();
    return 0.03*interest + interest;
  }
}
