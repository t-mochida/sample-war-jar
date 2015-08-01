package com.sample.warjar.service;

import java.io.IOException;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Service {
	static final Logger log = LoggerFactory.getLogger( Service.class );

	public String sayHello() throws IOException {
		log.info("called.");

		ResourceBundle resouce = ResourceBundle.getBundle("sample");
		return resouce.getString("msg.hello");
	}
}
