package com.stockshistory.config;
import javax.sql.DataSource;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import liquibase.integration.spring.SpringLiquibase;

@Configuration
public class LiquibaseConfig {


    private final DataSource dataSource;

    @Autowired
    public LiquibaseConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public SpringLiquibase liquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("db.changelog-master.yaml");
        liquibase.setDataSource(dataSource);
        liquibase.setDefaultSchema("stockshistory"); // Установите схему, если это необходимо
        return liquibase;
    }
}