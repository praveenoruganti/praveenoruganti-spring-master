package com.praveen.spring.core.di.circular.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@ComponentScan(basePackageClasses = CircularDependencyExampleUsingLazy.class, useDefaultFilters = false, includeFilters = {
		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {
				CircularDependencyExampleUsingLazy.BeanB.class, CircularDependencyExampleUsingLazy.BeanA.class }) })
@Configuration
public class CircularDependencyExampleUsingLazy {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CircularDependencyExampleUsingLazy.class);
		BeanA beanA = context.getBean(BeanA.class);
		beanA.doSomething();
	}

	@Component
	static class BeanA {
		private final BeanB beanB;

		BeanA(@Lazy BeanB b) {
			this.beanB = b;
		}

		public void doSomething() {
			beanB.doSomething();
		}
	}

	@Component
	static class BeanB {
		private final BeanA beanA;

		BeanB(BeanA beanA) {
			this.beanA = beanA;
		}

		public void doSomething() {
			System.out.println("doing something");
		}
	}
}