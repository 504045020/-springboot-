package com.cq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cq.Mapper")
public class Springboot03Application {
	public static void main(String[] args) {
		SpringApplication.run(Springboot03Application.class, args);
	}

}
