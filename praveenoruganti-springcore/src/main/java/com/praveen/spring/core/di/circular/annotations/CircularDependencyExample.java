package com.praveen.spring.core.di.circular.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@ComponentScan(basePackageClasses = CircularDependencyExample.class, useDefaultFilters = false,
//scan only the nested beans of this class
		includeFilters = { @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {
				CircularDependencyExample.BeanB.class, CircularDependencyExample.BeanA.class }) })
@Configuration
public class CircularDependencyExample {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(CircularDependencyExample.class);
	}

	@Component
	public static class BeanA {
		private final BeanB beanB;

		public BeanA(BeanB b) {
			this.beanB = b;
		}
	}

	@Component
	public static class BeanB {
		private final BeanA beanA;

		public BeanB(BeanA beanA) {
			this.beanA = beanA;
		}
	}
}
