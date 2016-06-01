package com.java.core.multithreading;

/**
 * Created by beiyong on 2016-6-1.
 */
public class MyThread1 extends Thread {
    private int num = 5;//总共票数设定为5张

    @Override
    public void run() {
        super.run();
        //卖票
        for (int i = 0; i < 10; i++) {
            sale();
        }
    }

    //同步
    private synchronized void sale() {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "sell ticket: " + num--);
            }
    }
}