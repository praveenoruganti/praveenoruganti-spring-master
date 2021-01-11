package com.praveen.spring.core.beanlifecycle.beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeTest {
	public static void main( String[] args ){  
	       AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(RequestConfig.class);
	        RequestManager bean = (RequestManager) context.getBean("requestmanager");
	        bean.handleRequest();
	        bean.handleRequest();
	        bean.handleRequest();
	        context.close();
	    }
}
