package edu.miu.cs.cs525.labs.mock1;

public interface Visitor {
    void visit(Employee employee);
    void visit(Manager manager);
}
