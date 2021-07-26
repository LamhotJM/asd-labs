package edu.miu.cs.cs525.labs.visitor;

import java.util.List;

import edu.miu.cs.cs525.labs.mock.*;

public class TotalAnnualBudgetVisitor implements Visitor {
//	@Override
//	public double visit(Employee employee) {
//		double total = 0;
//		if (employee instanceof Manager) {
//			total += employee.getTotalAnnualBudget();
//			List<Employee> employees = ((Manager) employee).getAllEmployeeByManager();
//			for (Employee e : employees) {
//				total += e.getTotalAnnualBudget();
//			}
//		}
//
//		return total;
//	}
	
	 int totAnnualBudget = 0;

	    @Override
	    public void visit(Employee employee) {
	        totAnnualBudget += (12 * employee.getSalary());
	    }

	    @Override
	    public void visit(Manager manager) {
	        totAnnualBudget += ((12 * (manager.getSalary() + manager.getBonus())) + manager.getTeamBudget());
	    }

	    public int getTotalAnnualBudget() {
	        return totAnnualBudget;
	    }
}
