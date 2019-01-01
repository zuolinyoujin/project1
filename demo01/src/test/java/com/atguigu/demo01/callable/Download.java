package com.atguigu.demo01.callable;

import java.util.concurrent.Callable;

/**
 * @author shkstart
 * @create 2018-10-12 下午 12:15
 */
public class Download implements Callable<String> {


    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName()+"下载任务完成");
        return "下载名：马里奥";
    }
}
