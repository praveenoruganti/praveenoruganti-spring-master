package com.praveen.spring.core.di.circular.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@ComponentScan(basePackageClasses = CircularDependencyExampleUsingSetter.class, useDefaultFilters = false, includeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {
				CircularDependencyExampleUsingSetter.BeanB.class, CircularDependencyExampleUsingSetter.BeanA.class }) })
@Configuration
public class CircularDependencyExampleUsingSetter {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CircularDependencyExampleUsingSetter.class);
		BeanA beanA = context.getBean(BeanA.class);
		beanA.doSomething();
	}

	@Component
	static class BeanA {
		private BeanB beanB;

		public BeanA() {
		}

		public void setB(BeanB b) {
			this.beanB = b;
		}

		public void doSomething() {
			System.out.println("doing something");
		}
	}

	@Component
	static class BeanB {
		private BeanA beanA;

		public BeanB() {
		}

		public void setBeanA(BeanA beanA) {
			this.beanA = beanA;
		}
	}
}
