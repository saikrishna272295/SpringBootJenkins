package com.sai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootJenkinsApplication {
    private static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);
    @PostConstruct
    public void init(){
        logger.info("Application started...");
    }
    public static void main(String[] args) {
        logger.info("Application executing...");
        SpringApplication.run(SpringBootJenkinsApplication.class, args);
    }
}
