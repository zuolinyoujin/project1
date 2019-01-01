package com.atguigu.demo01.thread_test;

/**
 * @author shkstart
 * @create 2018-10-11 下午 4:32
 */
public class test implements Runnable {
    @Override
    public void run() {
        for (int i = 0;i < 100;i++ ){
            if (i %  2 ==0){

                System.out.println(Thread.currentThread().getName()+"偶数===="+i);
            }
        }
    }
}

class test2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0;i < 100;i++ ){
            if (i % 2 != 0){

                System.out.println(Thread.currentThread().getName()+"奇数===="+i);
            }
        }
    }
}

class Thread2{
    public static void main(String[] args) {
        test test = new test();
        Thread thread = new Thread(test,"a===>");
        thread.start();

        test2 test2 = new test2();
        Thread thread1 = new Thread(test2,"b===>");
        thread1.start();
    }
}

