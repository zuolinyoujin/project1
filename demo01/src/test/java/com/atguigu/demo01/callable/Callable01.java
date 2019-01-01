package com.atguigu.demo01.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author shkstart
 * @create 2018-10-12 下午 12:17
 */
public class Callable01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask r = new FutureTask<String>(new Download());

        Thread t1 = new Thread(r, "1号");

        System.out.println("主线程");

        t1.start();

        String s = (String) r.get();

        System.out.println(s);

    }



}
