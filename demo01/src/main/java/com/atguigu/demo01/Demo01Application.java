package com.atguigu.demo01;

import com.atguigu.demo01.job.HelloeJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class Demo01Application {

    public static void main(String[] args) throws SchedulerException, InterruptedException{
        SpringApplication.run(Demo01Application.class, args);

        // 获取Scheduler实例

        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

        scheduler.start();

        System.out.println("scheduler.start");



        //具体任务.

        JobDetail jobDetail = JobBuilder.newJob(HelloeJob.class).withIdentity("job1","group1").build();



        //触发时间点. (每5秒执行1次.)

        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever();

        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1","group1").startNow().withSchedule(simpleScheduleBuilder).build();



        // 交由Scheduler安排触发

        scheduler.scheduleJob(jobDetail,trigger);



        //睡眠20秒.

        TimeUnit.SECONDS.sleep(20);

        scheduler.shutdown();//关闭定时任务调度器.

        System.out.println("scheduler.shutdown");


    }
}
