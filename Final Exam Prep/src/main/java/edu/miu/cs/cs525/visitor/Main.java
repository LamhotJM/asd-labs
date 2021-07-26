package edu.miu.cs.cs525.visitor;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		
		Component l1_1 = new Leaf("l1_1");
		Component l1_2 = new Leaf("l1_2");
		Composite c1_1 = new Composite("c1_1");
		
		Component l2_1 = new Leaf("l2_1");
		Composite c2_1 = new Composite("c2_1");
		Composite c2_2 = new Composite("c2_2");
		
		Component l3_1 = new Leaf("l3_1");
		Component l3_2 = new Leaf("l3_2");
		Component l3_3 = new Leaf("l3_3");
		
		c2_1.addComponent(l3_1);
		c2_1.addComponent(l3_2);
		c2_2.addComponent(l3_3);
		
		c1_1.addComponent(l2_1);
		c1_1.addComponent(c2_1);
		c1_1.addComponent(c2_2);
		
		root.addComponent(l1_1);
		root.addComponent(l1_2);
		root.addComponent(c1_1);
		
		Iterator<Component> it = root.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		ComponentCollector collector = new ComponentCollector();
		
		root.accept(collector);
		
		System.out.println(collector.getComponents());
		
		ComponentCounter counter = new ComponentCounter(collector);
		
		root.accept(counter);
		
		System.out.println(counter.getCount());
	}
}
