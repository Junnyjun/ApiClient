package com.example.foreignserver.openFeign;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.foreignserver.openFeign")
@EnableFeignClients(basePackages = "com.example.foreignserver.openFeign")
public class FeignConfiguration {
}
