package edu.miu.cs.cs525.labs.visitor;

import edu.miu.cs.cs525.labs.mock.*;

import java.util.List;

public class TotalAnnualSalaryVisitor implements Visitor {
	
	int totAnnualSalary = 0;
//	@Override
//	public double visit(Employee employee) {
//		double total = 0;
//		if (employee instanceof Manager) {
//			total += employee.getTotalAnnualSalary();
//			List<Employee> employees = ((Manager) employee).getAllEmployeeByManager();
//			// total + = employees.forEach(hireComponent ->
//			// hireComponent.getTotalAnnualSalary());
//
//			for (Employee e : employees) {
//				total += e.getTotalAnnualSalary();
//
//			}
//
//			// manager.components.forEach(hireComponent -> hireComponent.visit(this));
//
//		}
//
//		return total;
//	}
	
	  @Override
	    public void visit(Employee employee) {
	        totAnnualSalary += (12 *employee.getSalary());
	    }

	    @Override
	    public void visit(Manager manager) {
	        totAnnualSalary += (12 * (manager.getSalary() + manager.getBonus()));
	    }

	    public int getTotalAnnualSalary() {
	        return totAnnualSalary;
	    }
}
