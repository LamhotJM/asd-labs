package edu.miu.cs.cs525.labs.state;

public class Application {
    public static void main(String[] args) {
    	
    	System.out.println("Ceiling Fan App");
        CeilingFan fan = new CeilingFan();
        fan.pullgreen();
        fan.pullgreen();
        fan.pullgreen();
        fan.pullgreen();
        fan.pullred();
        fan.pullred();
    }
}
