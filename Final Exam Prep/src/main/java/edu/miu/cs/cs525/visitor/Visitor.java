package edu.miu.cs.cs525.visitor;

public interface Visitor {
	void visit(Leaf leaf);
	void visit(Composite composite);
}
