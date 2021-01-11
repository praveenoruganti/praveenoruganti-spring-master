package com.praveen.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

@Component
public class ContextStopHandler implements ApplicationListener<ContextStoppedEvent> {
	@Override
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("Context Stopped Event Received " + event.toString());
	}
}
