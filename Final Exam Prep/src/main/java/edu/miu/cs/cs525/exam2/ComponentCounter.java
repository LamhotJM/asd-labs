package edu.miu.cs.cs525.exam2;



public class ComponentCounter extends VisitorChain {
    // TODO
    int count = 0;
    public ComponentCounter(Visitor nextVisitor) {
        super(nextVisitor);
    }
    @Override
    protected void performVisit(Composite composite) {
        // TODO
        ++count;
    }

    @Override
    protected void performVisit(Leaf leaf) {
        // TODO
        ++count;
    }
}
