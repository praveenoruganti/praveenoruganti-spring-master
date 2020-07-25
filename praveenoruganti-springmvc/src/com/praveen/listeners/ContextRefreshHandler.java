package com.praveen.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextRefreshHandler implements ApplicationListener<ContextRefreshedEvent> {
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Context Refreshed Event Received " + event.toString());
	}
}
