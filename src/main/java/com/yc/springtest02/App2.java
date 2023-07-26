package com.yc.springtest02;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class App2 {
    public static void main(String[] args) {
        ExecutorService executorService=new ThreadPoolExecutor(3,5,
                0, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),  //使用由界队列 避免OOM
                new ThreadPoolExecutor.DiscardPolicy());

        for (int i=0;i<5;i++){
            executorService.submit(() ->{
                while (true){
                    Date d=new Date();
                    System.out.println(Thread.currentThread().getName()+"时间为："+d);
                    Thread.sleep(1000);
                }
            });
        }
        //  corePoolSize+queue+maxi

        //3个线程 + 1个任务不执行 + 1个新线程 => 4个线程
    }
}
