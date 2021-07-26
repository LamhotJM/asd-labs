package edu.miu.cs.cs525.labs.composite;

public class Application {

    public static void main(String[] args) {
        CEO ceo = new CEO("CEO");
        Manager mg1 = new Manager("Tom Hanks");
        Manager mg2 = new Manager("Leonardo DiCaprio");
        Manager mg3 = new Manager("Johnny Depp");
        Employee emp1 = new Employee("Denzel Washington");
        Employee emp2 = new Employee("Will Smith");
        Employee emp3 = new Employee("Brad Pitt");

        ceo.hire(mg1);
        ceo.hire(mg2);
        mg1.add(emp1);
        mg1.add(emp2);
        mg2.add(mg3);
        mg3.add(emp3);

        HireCounterAction visitor = new HireCounterAction();
        ceo.visit(visitor);
        System.out.println(visitor.getCount());
    }
}
