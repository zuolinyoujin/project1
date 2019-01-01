package com.atguigu.demo01.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * @author shkstart
 * @create 2018-12-23 下午 11:33
 */
public class HelloeJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        // 执行响应的任务.

        System.out.println("HelloJob.execute,"+new Date());
    }
}
