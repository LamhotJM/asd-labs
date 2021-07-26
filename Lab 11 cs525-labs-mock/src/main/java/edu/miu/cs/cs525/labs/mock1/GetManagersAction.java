package edu.miu.cs.cs525.labs.mock1;

import java.util.ArrayList;
import java.util.List;

public class GetManagersAction implements Visitor {
    List<Employee> managers = new ArrayList<>();

    @Override
    public void visit(Employee employee) {
    }

    @Override
    public void visit(Manager manager) {
        managers.add(manager);
    }

    public List<Employee> getManagers() {
        return managers;
    }
}
