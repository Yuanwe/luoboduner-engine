package com.luoboduner.api.home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luoboduner.dao.mapper")
public class LuobodunerApiHomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuobodunerApiHomeApplication.class, args);
    }
}
