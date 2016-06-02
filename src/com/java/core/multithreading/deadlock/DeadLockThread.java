package com.java.core.multithreading.deadlock;

/**
 * Created by beiyong on 2016-6-2.
 */
public class DeadLockThread implements Runnable {
    private static Zhangsan zhangsan = new Zhangsan();
    private static Lisi lisi = new Lisi();
    public boolean flag = false;

    @Override
    public void run() {
        if (flag){
            synchronized (zhangsan){
                zhangsan.say();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lisi){
                    zhangsan.get();
                }
            }
        }else{
            synchronized (lisi){
                lisi.say();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (zhangsan){
                    lisi.get();
                }
            }
        }
    }
}
