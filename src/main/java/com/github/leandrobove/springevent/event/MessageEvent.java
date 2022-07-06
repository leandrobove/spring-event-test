package com.github.leandrobove.springevent.event;

import lombok.Getter;

@Getter
public class MessageEvent {

	private String message;

	public MessageEvent(String message) {
		this.message = message;
	}

}
