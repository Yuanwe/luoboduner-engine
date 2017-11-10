package com.luoboduner.web.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luoboduner.dao.mapper")
public class LuobodunerWebAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuobodunerWebAdminApplication.class, args);
	}
}
