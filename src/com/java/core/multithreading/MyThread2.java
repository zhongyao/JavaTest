package com.java.core.multithreading;

/**
 * Created by beiyong on 2016-6-1.
 */
public class MyThread2 implements Runnable {
    private int num = 5;//�ܹ�Ʊ���趨Ϊ5��

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            sale();
        }
    }

    //ͬ��
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