package com.atguigu.demo01.runnable;

/**
 * @author shkstart
 * @create 2018-10-12 下午 5:04
 */
public class Thread02 {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();

        Thread t1 = new Thread(ticket,"1号");
        t1.start();

        Thread t2 = new Thread(ticket2,"2号");
        t2.start();

        Thread t3 = new Thread(ticket3,"3号");
        t3.start();
    }
}
