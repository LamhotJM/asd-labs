package edu.miu.cs.cs525.labs.proxy;

public class Application {
    public static void main(String[] args) throws InterruptedException {
    	
    	ComplexClassInt complex = new ComplexClassProxy();
	    complex.veryComplicatedTask();
	    
	    complex = ((ComplexClassProxy)complex).click();
	    complex.veryComplicatedTask();
    	
    }
}
