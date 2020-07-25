package com.praveen.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextCloseHandler implements ApplicationListener<ContextClosedEvent> {
	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("Context Closed Event Received " + event.toString());
	}
}
