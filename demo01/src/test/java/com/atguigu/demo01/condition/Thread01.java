package com.atguigu.demo01.condition;

/**
 * @author shkstart
 * @create 2018-10-12 下午 9:20
 */
public class Thread01 {

    public static void main(String[] args) {
        Test01 test1 = new Test01();
        new Thread(()->{
            for (int i = 0;i <10;i++){
                test1.cutFuntion();
            }
        },"0号线程").start();

        new Thread(()->{
            for (int i = 0;i <10;i++){
                test1.cookFuntion();
            }
        },"1号线程").start();

        new Thread(()->{
            for (int i = 0;i <10;i++){
                test1.GoFuntion();
            }
        },"2号线程").start();
    }
}
