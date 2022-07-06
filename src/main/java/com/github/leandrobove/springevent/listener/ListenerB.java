package com.github.leandrobove.springevent.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.github.leandrobove.springevent.event.MessageEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ListenerB implements ApplicationListener<MessageEvent> {

	public void watchMessage(String message) {
		log.info("ListenerB : watching message: {}", message);
	}

	@Override
	public void onApplicationEvent(MessageEvent event) {
		watchMessage(event.getMessage());
	};
}
