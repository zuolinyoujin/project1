package com.atguigu.demo01.runnable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shkstart
 * @create 2018-10-12 上午 11:34
 */
public class Ticket implements Runnable{

    private static int poll = 100;
    private Lock lock = new ReentrantLock();

//    public void sell() {
//        lock.lock();
//        try{
//            if (poll > 0){
//                    poll --;
//                    System.out.println(Thread.currentThread().getName()+"服务员卖出一张票，剩下"+poll+"张票");
//            }
//        }finally {
//
//            lock.unlock();
//        }
//
//
//    }

    @Override
    public synchronized void run() {
//        lock.lock();
        try{
            for (int i = 0;i < 40;i++){
                if (poll > 0){
                    poll --;
                    System.out.println(Thread.currentThread().getName()+"服务员卖出一张票，剩下"+poll+"张票");
                }
            }
        }finally {

//            lock.unlock();
        }
    }
}
