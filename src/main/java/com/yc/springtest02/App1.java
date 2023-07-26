package com.yc.springtest02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App1 extends Thread{
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
            Thread thread=new App1();
            thread.start();
        }
    }

    @Override
    public void run() {
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
        String str = s.format(new Date());
        System.out.println("线程输出时间为： "+str);
    }
}
