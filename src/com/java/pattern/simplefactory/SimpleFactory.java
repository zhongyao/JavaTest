package com.java.pattern.simplefactory;

public class SimpleFactory {

	public static void main(String[] args) {
		
		Car c = Factory.getInstance("Benz");
		if (c != null) {
			c.run();
			c.stop();
		}else {
			System.out.println("无法制造");
		}
		
	}

}
