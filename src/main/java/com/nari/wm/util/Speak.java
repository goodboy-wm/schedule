package com.nari.wm.util;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Speak {

    private int count1 = 1;

    private int count2 = 2;


    @Scheduled(cron = "0 34 16 * * ?")
    @Async
    public void count(){
        System.out.println(Thread.currentThread().getName()+"   "+count1++);
    }

}
