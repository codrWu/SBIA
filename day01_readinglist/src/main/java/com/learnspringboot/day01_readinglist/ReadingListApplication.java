package com.learnspringboot.day01_readinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication耦合了三个注解  p22
 * @Configuration
 * @ComponentScan
 * @EnableAutoConfiguration
 * 从Spring Boot 1.2.0 开始  就耦合到一个注解上了
 */
@SpringBootApplication
public class ReadingListApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadingListApplication.class, args);
    }

}
