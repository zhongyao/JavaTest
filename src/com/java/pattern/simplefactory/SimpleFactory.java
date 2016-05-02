package com.java.pattern.simplefactory;
/**
 * 设计模式之简单工厂模式：
 * 将一个具体类的实例化交给一个静态工厂方法来执行，它不属于GOF的23种设计模式，但现实中却经常会用到
 * @author zhongyao
 *
 */
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
