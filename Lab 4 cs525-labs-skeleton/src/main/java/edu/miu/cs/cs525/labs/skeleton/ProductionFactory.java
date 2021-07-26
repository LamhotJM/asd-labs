package edu.miu.cs.cs525.labs.skeleton;

public class ProductionFactory implements AccountDAOFactory{
  public ProductionFactory() {
    createAccountDAO();
  }

  @Override
  public AccountDAO createAccountDAO() { return new AccountDAOImpl(); }
}
