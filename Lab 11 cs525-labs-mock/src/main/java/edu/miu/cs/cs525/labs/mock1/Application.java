package edu.miu.cs.cs525.labs.mock1;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Manager ceo = new Manager("ABC1231", "John", "CEO", LocalDate.now());//LocalDate.of(1996, 2, 15)
        Manager manager1 = new Manager("ABC1232", "Tom", "Hanks", LocalDate.now());
        Manager manager2 = new Manager("ABC1233", "Leonardo", "DiCaprio", LocalDate.now());
        Manager manager3 = new Manager("ABC1234", "Johnny", "Depp", LocalDate.now());
        Employee employee1 = new Employee("ABC1235", "Denzel", "Washington", LocalDate.now());
        Employee employee2 = new Employee("ABC1236", "Will", "Smith", LocalDate.now());
        Employee employee3 = new Employee("ABC1237", "Brad", "Pitt", LocalDate.now());

        ceo.addTeamMember(manager1);
        ceo.addTeamMember(manager2);
        manager1.addTeamMember(employee1);
        manager1.addTeamMember(employee2);
        manager2.addTeamMember(manager3);
        manager3.addTeamMember(employee3);


//        HireCounterAction hireCounterAction = new HireCounterAction();
//        ceo.accept(hireCounterAction);
//        System.out.println(hireCounterAction.getCount());

        // 1) getManagers() implementation
        GetManagersAction getManagersAction = new GetManagersAction();
        employee2.acceptUpward(getManagersAction);
        System.out.println("----Managers----");
        getManagersAction.getManagers().forEach(component -> System.out.println(component.getFirstName()+ " Position is: "+component.getPosition()));
//        System.out.println(getManagersAction.getManagers());

        // 2) getEmployees() implementation
        GetEmployeeAction getEmployeeAction = new GetEmployeeAction();
        ceo.accept(getEmployeeAction);
        System.out.println("----Employees----");
        getEmployeeAction.getEmployeeUnderManager().forEach(component -> System.out.println(component.getFirstName()+ " Position is: "+component.getPosition()));
//        System.out.println(getEmployeeAction.getEmployeeUnderManager());

        // 3) getTotalSalary() implementation
        GetTotalSalaryAction getTotalSalaryAction = new GetTotalSalaryAction();
        ceo.accept(getTotalSalaryAction);
        System.out.println(getTotalSalaryAction.getTotalSalary());

        // 4) getTotalAnnualSalary() implementation
        GetTotalAnnualSalaryAction getTotalAnnualSalaryAction = new GetTotalAnnualSalaryAction();
        ceo.accept(getTotalAnnualSalaryAction);
        System.out.println(getTotalAnnualSalaryAction.getTotalAnnualSalary());

        // 5) getTotalAnnualBudget() implementation
        GetTotalAnnualBudgetAction getTotalAnnualBudgetAction = new GetTotalAnnualBudgetAction();
        ceo.accept(getTotalAnnualBudgetAction);
        System.out.println(getTotalAnnualBudgetAction.getTotalAnnualBudget());
    }
}
