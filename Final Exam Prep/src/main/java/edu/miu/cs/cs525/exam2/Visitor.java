package edu.miu.cs.cs525.exam2;

public interface Visitor {
    void visit(Composite composite);
    void visit(Leaf leaf);
}
