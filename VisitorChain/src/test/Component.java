package test;

import java.util.Iterator;

public abstract class Component implements Iterable<Component> {
	private String name;
	
	public Component(String name) {
		this.name = name;
	}
	
	public abstract void accept(Visitor visitor);
	
	public Iterator<Component> iterator() {
		ComponentCollector v = new ComponentCollector();
		
		this.accept(v);
		
		return v.getComponents().iterator();
	}
	
	public String toString() {
		return name;
	}
}
