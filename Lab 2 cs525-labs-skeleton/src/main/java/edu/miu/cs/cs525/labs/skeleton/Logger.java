package edu.miu.cs.cs525.labs.skeleton;

public class Logger implements Observer {
  private Subject account;
  public Logger(Subject account) {
    this.account = account;
    account.registerObserver(this);
  }

  @Override
  public void inform() {
    System.out.println("Logger: account updated");
  }
}
