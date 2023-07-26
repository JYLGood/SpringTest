package com.yc.spring.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 相当于一个beans.xml配置文件
 */
@Configuration      //此注解表示这个类是一个配置类  相当于 bean.xml文件
public class AppConfig {
    @Bean   //  <bean id="a" class="com.yc.spring.test2.Apple>
    public Apple a(){
//        return new Apple();
        Apple apple=new Apple();
        apple.setId(100);
        return apple;
    }
    //apple对象以 a  作键名 存到ApplicationContext容器中

    @Bean
    public ThreadPoolExecutor tpe(){
        int corePoolSize =Runtime.getRuntime().availableProcessors();
        //核心新参池的最大线程数
        int maxPoolSize=corePoolSize*2;
        //线程最大空闲时间
        long keepAliveTime=10;
        //时间单位
        TimeUnit unit=TimeUnit.SECONDS;//enum枚举  常量
        //阻塞队列 容量为2  最多允许放两个 空闲任务
        BlockingQueue<Runnable> workQueue=new ArrayBlockingQueue<>(maxPoolSize*4);
        //
        ThreadPoolExecutor executor=new ThreadPoolExecutor(corePoolSize,maxPoolSize,keepAliveTime,unit,workQueue);
        //预启动所有核心线程 提升效率
        executor.prestartAllCoreThreads();
        return executor;
    }
}
