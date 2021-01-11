package com.praveen.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan("com.praveen")
@PropertySource("classpath:database.properties")
public class AppConfig {

	@Value("${db.driver}")
	private String DB_DRIVER;

	@Value("${db.password}")
	private String DB_PASSWORD;

	@Value("${db.url}")
	private String DB_URL;

	@Value("${db.username}")
	private String DB_USERNAME;

	@Bean
	public DataSource datasource() throws PropertyVetoException {
		HikariDataSource datasource = new HikariDataSource();
		datasource.setDriverClassName(DB_DRIVER);
		datasource.setJdbcUrl(DB_URL);
		datasource.setUsername(DB_USERNAME);
		datasource.setPassword(DB_PASSWORD);
		return datasource;
	}
}
