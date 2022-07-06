package com.github.leandrobove.springevent.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.github.leandrobove.springevent.event.MessageEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ListenerB {

	public void watchMessage(String message) {
		log.info("ListenerB : watching message: {}", message);
	}

	@EventListener
	public void listenToEvent(MessageEvent event) {
		watchMessage(event.getMessage());
	};
}
