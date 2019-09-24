package com.frog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.frog.mapper")
public class ReleasePlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReleasePlatformApplication.class, args);
	}

}
