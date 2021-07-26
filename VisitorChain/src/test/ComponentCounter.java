package test;

public class ComponentCounter extends VisitorChain {
	private int count = 0;

	public ComponentCounter(Visitor nextVisitor) {
		super(nextVisitor);
	}

	@Override
	public void performVisit(Leaf leaf) {
		count++;
	}

	@Override
	public void performVisit(Composite composite) {
		count++;
	}

	public int getCount() {
		return count;
	}
}
