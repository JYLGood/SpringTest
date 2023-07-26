package com.yc.springtest02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
@ComponentScan(value = "com.yc.springtest02")
public class Config {
    @Bean  //IOC  -> @Component @Service @Repository @Controller
    public ExecutorService threadPoolExecutor(   ){
        return new ThreadPoolExecutor(3,5,
                0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),  //使用由界队列 避免OOM(OOM内存不足)
                new ThreadPoolExecutor.DiscardPolicy());
    }
}
