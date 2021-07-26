package edu.miu.cs.cs525.labs.visitor;

import edu.miu.cs.cs525.labs.mock.Employee;
import edu.miu.cs.cs525.labs.mock.Manager;

public interface Visitor {
	void visit(Employee employee);
	void visit(Manager manager);
}
