package com.java.pattern.simplefactory;

public class SimpleFactory {

	public static void main(String[] args) {
		
		Car c = Factory.getInstance("Benfz");
		if (c != null) {
			c.run();
			c.stop();
		}else {
			System.out.println("�޷�����");
		}
		
	}

}
