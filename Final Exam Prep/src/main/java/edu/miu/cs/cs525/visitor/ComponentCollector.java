package edu.miu.cs.cs525.visitor;

import java.util.*;

public class ComponentCollector implements Visitor {
	private Collection<Component> components = new LinkedList<Component>();

	@Override
	public void visit(Leaf leaf) {
		this.components.add(leaf);
	}

	@Override
	public void visit(Composite composite) {
		this.components.add(composite);
	}
	
	public Collection<Component> getComponents() {
		return this.components;
	}

}
