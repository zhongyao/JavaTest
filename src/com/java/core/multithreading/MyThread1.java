package com.java.core.multithreading;

/**
 * Created by beiyong on 2016-6-1.
 */
public class MyThread1 extends Thread {
    private int num = 5;//�ܹ�Ʊ���趨Ϊ5��

    @Override
    public void run() {
        super.run();
        //��Ʊ
        for (int i = 0; i < 10; i++) {
            sale();
        }
    }

    //ͬ��
    private synchronized void sale() {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "sell ticket: " + num--);
            }
    }
}