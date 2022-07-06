package com.github.leandrobove.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.leandrobove.springevent.publisher.MessagePublisher;

@SpringBootApplication
public class SpringEventApplication implements CommandLineRunner {

	@Autowired
	private MessagePublisher publisher;

	public static void main(String[] args) {
		SpringApplication.run(SpringEventApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		publisher.sendMessage("Super secret message here");
	}

}
