package edu.miu.cs.cs525.labs.skeleton;

public interface AccountType {
  public default double computeInterest(double balance){ return 0; };
}
