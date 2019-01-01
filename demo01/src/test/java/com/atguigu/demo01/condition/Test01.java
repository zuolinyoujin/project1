package com.atguigu.demo01.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author shkstart
 * @create 2018-10-12 下午 8:53
 */
public class Test01 {

    private static int num = 0;
    private Lock lock = new ReentrantLock();
    private Condition cut = lock.newCondition();
    private Condition cook = lock.newCondition();
    private Condition go = lock.newCondition();

    public void cutFuntion(){
        lock.lock();
        try{
            while (num !=0){
                cut.await();
            }
            num = 1;
            System.out.println("0号");
            cook.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void cookFuntion(){
        lock.lock();
        try{
            while (num !=1){
                cook.await();
            }
            num = 2;
            System.out.println("1号");
            go.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void GoFuntion(){
        lock.lock();
        try{
            while (num !=2){
                go.await();
            }
            num = 0;
            System.out.println("2号");
            cut.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
