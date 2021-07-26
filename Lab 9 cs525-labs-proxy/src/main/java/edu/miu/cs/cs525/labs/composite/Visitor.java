package edu.miu.cs.cs525.labs.composite;

public interface Visitor {
    void accept(Employee employee);
    void accept(Manager manager);
}
