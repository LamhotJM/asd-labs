package edu.miu.cs.cs525.labs.composite;

public class HireCounterAction implements Visitor{
    int count = 0;
    @Override
    public void accept(Employee employee) {
        ++count;
    }

    @Override
    public void accept(Manager manager) {
        ++count;
        manager.components.forEach(hireComponent -> hireComponent.visit(this));
    }

    public int getCount(){
        return count;
    }
}
