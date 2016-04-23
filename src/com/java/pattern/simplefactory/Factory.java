package com.java.pattern.simplefactory;

public class Factory {
	// public static Car getInstance() {
	// return new Ford();
	// }

//	public static Car getInstance(String type) {
//		Car c = null;
//		if (type.equals("Benz")) {
//			c = new Benz();
//		} else if (type.equals("Ford")) {
//			c = new Ford();
//		} else {
//			
//		}
//		return c;
//	}
	
	public static Car getInstance(String type){
		Car c = null;
			try {
				c = (Car) Class.forName("com.java.pattern.simplefactory"+type).newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return c;
	}
}
