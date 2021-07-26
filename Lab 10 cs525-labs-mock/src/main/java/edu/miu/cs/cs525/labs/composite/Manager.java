package edu.miu.cs.cs525.labs.composite;

import java.util.ArrayList;
import java.util.Collection;

public class Manager extends HireComponent {
    protected Collection<HireComponent> components = new ArrayList<>();
    private final String name;

    public Manager(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    @Override
    public void visit(Visitor action) {
        action.accept(this);
    }

    @Override
    public void add(HireComponent component) {
        components.add(component);
    }
}
