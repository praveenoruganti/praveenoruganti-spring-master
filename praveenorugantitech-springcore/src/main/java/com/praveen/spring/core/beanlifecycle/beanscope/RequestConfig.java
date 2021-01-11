package com.praveen.spring.core.beanlifecycle.beanscope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RequestConfig {

	@Bean(name="requestmanager")
	 public RequestManager requestManager(){
	  return new RequestManager();
	}
	
	@Bean(name="requesthandler") 
	 public RequestHandler requestHandler(){
	  return new RequestHandler();
	}

}
