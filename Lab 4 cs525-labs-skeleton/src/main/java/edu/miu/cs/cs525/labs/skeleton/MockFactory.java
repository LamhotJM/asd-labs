package edu.miu.cs.cs525.labs.skeleton;

public class MockFactory implements AccountDAOFactory{
  public MockFactory() {
    createAccountDAO();
  }

  @Override
  public AccountDAO createAccountDAO() {
    return new MockAccountDAOImpl();
  }
}
