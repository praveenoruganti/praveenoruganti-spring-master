package com.praveen.spring.core.beanlifecycle.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RequestHandler {

	RequestHandler() {
		System.out.println("In Request Handler Constructor");
	}

	public void handleRequest() {
		System.out.println("Handling request");
	}
}
