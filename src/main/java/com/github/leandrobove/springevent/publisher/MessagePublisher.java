package com.github.leandrobove.springevent.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.github.leandrobove.springevent.event.MessageEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class MessagePublisher {

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	public void sendMessage(String message) {
		log.info("Publishing an event, listeners should be executed now..");

		applicationEventPublisher.publishEvent(new MessageEvent(this, message));
	}

}
