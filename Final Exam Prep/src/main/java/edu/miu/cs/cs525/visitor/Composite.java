package edu.miu.cs.cs525.visitor;

import java.util.*;

public class Composite extends Component {
	private List<Component> components;
	
	public Composite(String name) {
		super(name);
		
		this.components = new ArrayList<Component>();
	}
	
	public void addComponent(Component c) {
		this.components.add(c);
	}
	
	public void removeComponent(Component c) {
		this.components.remove(c);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
		this.components.forEach(c -> c.accept(visitor));
	}

}
