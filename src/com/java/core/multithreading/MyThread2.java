package com.java.core.multithreading;

/**
 * Created by beiyong on 2016-6-1.
 */
public class MyThread2 implements Runnable {
    private int num = 5;//总共票数设定为5张

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sale();
        }
    }

    //同步
    private synchronized void sale() {
        if (num > 0) {
            if(num == 3){
                try {
                    Thread.sleep(3*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "sell tickets: " + num--);
        }
    }
}