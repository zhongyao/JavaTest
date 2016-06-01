package com.java.core.multithreading;

/**
 * ���߳�
 */
public class ThreadTest {
    public static void main(String[] args) {
        /**
         * �̳�Thread�໹��ʵ��Runnable�ӿڣ�
         *
         * 1�����ⵥ�̳еľ���,һ�������ͬʱʵ�ֶ���ӿ�
         * 2��ʵ��Runnable�ӿڵķ�ʽ�������߳̿��Դ���ͬһ��Դ���Ӷ�ʵ����Դ�Ĺ���
         */

        /**
         * ʹ�ü̳�Thread������Ʊ������ʵ����Դ�Ĺ�����
         * һ��5��Ʊ������15�ţ���ÿ���߳�����5�ţ�
         * ÿ���̶߳���������û��ʵ����Դ�Ĺ���
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
         * ʹ��ʵ��Runnable������Ʊ����ʵ����Դ������
         * һ��5��Ʊ������5�ţ���һ������5�ţ�
         * �߳�֮�乲����Ʊ��Դ��ʵ������Դ�Ĺ���
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