package edu.miu.cs.cs525.labs.mock;

import java.time.LocalDate;

import edu.miu.cs.cs525.labs.visitor.TotalAnnualBudgetVisitor;
import edu.miu.cs.cs525.labs.visitor.TotalAnnualSalaryVisitor;
import edu.miu.cs.cs525.labs.visitor.TotalSalaryVisitor;

public class Application {
	public static void main(String[] args) {
		Manager ceo = new Manager("EMP1", "Renold", "Wijaya", LocalDate.of(1994, 8, 2), 10000, 400);

		Manager manager1 = new Manager("EMP2", "John", "Min", LocalDate.of(1998, 7, 16), 1400, 40);
		Manager manager2 = new Manager("EMP3", "Lee", "Lin", LocalDate.of(1999, 2, 15), 300, 30);
		Manager manager3 = new Manager("EMP4", "Ken", "Hod", LocalDate.of(1995, 1, 3), 820, 13);

		Employee emp1 = new Employee("EMP5", "Chera", "Kj", LocalDate.of(1999, 6, 7));
		Employee emp2 = new Employee("EMP6", "Soh", "Hs", LocalDate.of(1999, 6, 2));
		Employee emp3 = new Employee("EMP7", "Lem", "SH", LocalDate.of(1995, 7, 1));
		Employee emp4 = new Employee("EMP8", "Chiu", "Tor", LocalDate.of(1992, 5, 2));
		Employee emp5 = new Employee("EMP9", "Dan", "Tud", LocalDate.of(1990, 5, 3));
		Employee emp6 = new Employee("EMP10", "Kuah", "He", LocalDate.of(1991, 3, 18));

		manager1.addEmployee(emp1);
		manager1.addEmployee(emp2);
		manager2.addEmployee(emp3);
		manager2.addEmployee(emp3);
		manager2.addEmployee(emp5);
		manager1.addEmployee(manager2);
		manager3.addEmployee(emp6);
		ceo.addEmployee(manager1);
		ceo.addEmployee(manager3);

		System.out.println("Q1 Managers from Employee");
		System.out.println(emp5.getManagers() + "\n");
		
		System.out.println("Q2 Employees from Manager");
		System.out.println(manager1.getAllEmployeeByManager() + "\n");
		
		
		System.out.println("Q3 Get Total Salary from Manager");
        TotalSalaryVisitor totalSalary = new TotalSalaryVisitor();
        emp1.accept(totalSalary);
        System.out.println(totalSalary.getTotalSalary());

    	System.out.println("Q4 Get Total Annual Salary from Manager");
        TotalAnnualSalaryVisitor totalAnnualSalary = new TotalAnnualSalaryVisitor();
        emp1.accept(totalAnnualSalary);
        System.out.println(totalAnnualSalary.getTotalAnnualSalary());

        System.out.println("Q5 Get Total Annual Budget from Manager");
        TotalAnnualBudgetVisitor totalAnnualBudget = new TotalAnnualBudgetVisitor();
        emp1.accept(totalAnnualBudget);
        System.out.println(totalAnnualBudget.getTotalAnnualBudget());
	}
}
