package com.union;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.union.dao")
public class UnionApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnionApplication.class, args);
	}
}
