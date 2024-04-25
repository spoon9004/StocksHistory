package com.stockshistory;

import com.stockshistory.config.LiquibaseConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(LiquibaseConfig.class, args);
    }
}