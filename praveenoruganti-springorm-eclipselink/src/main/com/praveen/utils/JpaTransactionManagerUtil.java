package com.praveen.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;

@Configuration
public class JpaTransactionManagerUtil {
	@PersistenceUnit(name = "SpringJpaEclipseLinkORM")
	private EntityManagerFactory entityManagerFactory;

	@Bean
	public JpaTransactionManager transactionManager() {
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
		return jpaTransactionManager;
	}
}
