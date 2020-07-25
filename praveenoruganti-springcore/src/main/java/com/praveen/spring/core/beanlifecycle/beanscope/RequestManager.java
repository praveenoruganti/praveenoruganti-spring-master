package com.praveen.spring.core.beanlifecycle.beanscope;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class RequestManager implements ApplicationContextAware{
	 private RequestHandler requestHandler;
	 private ApplicationContext applicationContext;
	 public void handleRequest(){
	  requestHandler = getRequestHandler();
	  requestHandler.handleRequest();
	 }
	 // method to return new instance
	 public RequestHandler getRequestHandler() {
	  return applicationContext.getBean("requesthandler", RequestHandler.class);
	 }

	 @Override
	 public void setApplicationContext(ApplicationContext applicationContext)
	   throws BeansException {
	  this.applicationContext = applicationContext; 
	 }
	}
