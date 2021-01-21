package com.nari.wm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchemeleApp {

    public static void main(String[] args) {
        SpringApplication.run(SchemeleApp.class,args);
    }

}
