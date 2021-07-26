package edu.miu.cs.cs525.labs.mock;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getTeamBudget() {
		return teamBudget;
	}

	public void setTeamBudget(double teamBudget) {
		this.teamBudget = teamBudget;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	private double bonus;
	private double teamBudget;
	private List<Employee> employees = new ArrayList<>();

	public Manager(String employeeId, String firstName, String lastName, LocalDate birthDate, double bonus,
			double teamBudget) {
		super(employeeId, firstName, lastName, birthDate);
		this.setPosition("Manager");
		this.bonus = bonus;
		this.teamBudget = teamBudget;
	}

	public void addEmployee(Employee e) {
		employees.add(e);
	    e.setManager(this);
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public List<Employee> getAllEmployeeByManager() {
		List<Employee> employees = new ArrayList<>();
		for (Employee emp : this.getEmployees()) {
			employees.add(emp);
			if (emp instanceof Manager) {
				employees.addAll(((Manager) emp).getAllEmployeeByManager());
			}
		}
		return employees;
	}

	public double getTotalAnnualSalary() {
		return 12 * this.getSalary() + bonus;
	}

	public double getTotalAnnualBudget() {
		return this.getTotalAnnualSalary() + teamBudget;
	}
}
