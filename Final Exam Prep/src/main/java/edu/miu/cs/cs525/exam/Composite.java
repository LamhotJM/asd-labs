package edu.miu.cs.cs525.exam;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Composite extends Component {
    private final Collection<Component> components = new LinkedList<>();

    public void addComponent(Component c) {
        components.add(c);
    }

    public void removeComponent(Component c) {
        components.remove(c);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
        for (Component c : components) {
            c.accept(v);
        }
    }
    
    // Add new line

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public Iterator<Component> iterator() {
        return components.iterator();
    }

}
