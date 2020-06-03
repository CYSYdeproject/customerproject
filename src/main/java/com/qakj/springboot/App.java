package com.qakj.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.qakj.springboot.mapper")
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		System.out.println("ooooooooooooo");
		System.out.println("hello everybody");
	System.out.println("nice to meet you!!!1111");
	}
}
