package edu.miu.cs.cs525.labs.proxy;

public class ComplexClass implements ComplexClassInt {

	public ComplexClass() throws InterruptedException {

		super();

		Thread.sleep(10000);

	}

	public void veryComplicatedTask() {

		System.out.println("Very complicated task...");

	}

}