package edu.miu.cs.cs525.labs.composite;

public abstract class HireComponent {
    abstract void visit(Visitor action);
    public void add(HireComponent component){
        throw new UnsupportedOperationException();
    }
}
