package com.github.leandrobove.springevent.event;

import org.springframework.context.ApplicationEvent;

import lombok.Getter;

@Getter
public class MessageEvent extends ApplicationEvent {

	private String message;

	public MessageEvent(Object source) {
		super(source);
	}

	public MessageEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

}
