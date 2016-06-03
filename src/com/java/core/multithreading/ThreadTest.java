package com.java.core.multithreading;

import com.java.core.multithreading.deadlock.DeadLockThread;


/**
 * 多线程
 */
public class ThreadTest {
    public static void main(String[] args) {

        /**
         * 继承Thread类还是实现Runnable接口？
         *
         * 1、避免单继承的局限,一个类可以同时实现多个接口
         * 2、实现Runnable接口的方式创建的线程可以处理同一资源，从而实现资源的共享
         */
//        resourcesShare();

        /**
         * 线程死锁：
         * 过多的同步可能导致死锁：死锁表示在程序时，互相等待。
         * 程序模拟：张三向李四要画，用书交换；李四向张三要书，用画交换。
         */
        deadLock();

    }

    private static void deadLock() {
        DeadLockThread deadLockThread1 = new DeadLockThread();
        DeadLockThread deadLockThread2 = new DeadLockThread();

        deadLockThread1.flag = true;
        deadLockThread2.flag = false;

        Thread thread1 = new Thread(deadLockThread1);
        Thread thread2 = new Thread(deadLockThread2);

        thread1.start();
        thread2.start();

    }

    private static void resourcesShare() {

        /**
         * 使用继承Thread的类卖票（不可实现资源的共享）
         * 一共5张票，卖了15张，即每个线程买了5张：
         * 每个线程独立运作，没有实现资源的共享
         */
        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();
        MyThread1 myThread3 = new MyThread1();

        myThread1.setName("ticket window1");
        myThread2.setName("ticket window2");
        myThread3.setName("ticket window3");

        myThread1.start();
        myThread2.start();
        myThread3.start();


        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * 使用实现Runnable的类卖票（可实现资源共享）
         * 一共5张票，卖了5张，即一共卖了5张：
         * 线程之间共享车票资源，实现了资源的共享
         */
        MyThread2 thread = new MyThread2();

        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);
        Thread thread3 = new Thread(thread);

        thread1.setName("ticket window1");
        thread2.setName("ticket window2");
        thread3.setName("ticket window3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
