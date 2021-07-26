package edu.miu.cs.cs525.labs.proxy;

public class ComplexClassProxy implements ComplexClassInt {

	public ComplexClassProxy() throws InterruptedException {

		super();

		Thread.sleep(10000);

	}

	public void veryComplicatedTask() {

		System.out.println("Very complicated task...");

	}
	
	public ComplexClass click() throws InterruptedException {
	
        return new ComplexClass();
	}

}