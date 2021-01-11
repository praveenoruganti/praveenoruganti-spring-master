package com.praveen.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStartHandler implements ApplicationListener<ContextStartedEvent> {
	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Context Started Event Received " + event.toString());
	}
}
