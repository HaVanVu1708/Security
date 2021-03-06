package com.example.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = {"${spring.data.jpa.repository.packages}"})
public class DemoDataSourceConfig {
    @Primary
    @Bean
    @ConfigurationProperties(prefix = "spring.data.jpa.enity")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, DataSource appDataSource){
        return builder
                .dataSource(appDataSource)
                .build();
    }

    @Bean
    @ConfigurationProperties(prefix = "security.datasource")
    public DataSource secutiryDataSource(){
        return DataSourceBuilder.create().build();
    }
}
