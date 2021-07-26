package edu.miu.cs.cs525.labs.visitor;

import java.util.List;

import edu.miu.cs.cs525.labs.mock.*;

public class TotalSalaryVisitor implements Visitor {
	int totSalary = 0;

//	public double visit(Employee employee) {
//		double total = 0;
//		if (employee instanceof Manager) {
//			total += employee.getSalary();
//			List<Employee> employees = ((Manager) employee).getAllEmployeeByManager();
//			for (Employee e : employees) {
//				total += e.getSalary();
//			}
//		}
//
//		return total;
//	}
	
	 @Override
	    public void visit(Employee employee) {
	        totSalary += employee.getSalary();
	    }

	    @Override
	    public void visit(Manager manager) {
	        totSalary += manager.getSalary() + manager.getBonus();
	    }

	    public int getTotalSalary() {
	        return totSalary;
	    }
}
