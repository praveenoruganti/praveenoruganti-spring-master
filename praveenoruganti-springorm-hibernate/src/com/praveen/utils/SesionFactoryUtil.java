package com.praveen.utils;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.praveen.entity.Employee;

@Configuration
public class SesionFactoryUtil {
	@Autowired
	private DataSource dataSource;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(dataSource);
		localSessionFactoryBean.setHibernateProperties(properties());
		localSessionFactoryBean.setAnnotatedClasses(Employee.class);
		return localSessionFactoryBean;

	}

	private Properties properties() {
		Properties properties = new Properties();

		properties.setProperty("hibernate.show_sql", "true");
		return properties;

	}
}
