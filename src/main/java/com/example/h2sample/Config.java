package com.example.h2sample;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Bean
    public DataSource createDatasource() {
        return DataSourceBuilder.create()
                .username("sa")
                .password("")
                .url("jdbc:h2:mem:testdb;MODE=PostgreSQL")
                .driverClassName("org.h2.Driver")
                .build();
    }

}
