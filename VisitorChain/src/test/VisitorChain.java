package test;

public abstract class VisitorChain implements Visitor {
	private Visitor nextVisitor;
	
	public VisitorChain(Visitor nextVisitor) {
		this.nextVisitor = nextVisitor;
	}
	
	public void visit(Leaf leaf) {
		performVisit(leaf);
		
		this.nextVisitor.visit(leaf);
	}
	
	public void visit(Composite composite) {
		performVisit(composite);
		
		this.nextVisitor.visit(composite);
	}
	
	public abstract void performVisit(Leaf leaf);
	
	public abstract void performVisit(Composite composite);
}
