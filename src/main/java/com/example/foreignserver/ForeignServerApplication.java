package com.example.foreignserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
public class ForeignServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForeignServerApplication.class, args);
	}

}
