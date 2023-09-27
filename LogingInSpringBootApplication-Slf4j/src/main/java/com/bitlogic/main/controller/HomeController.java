package com.bitlogic.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	private static final Logger LOGGER=LoggerFactory.getLogger(HomeController.class);
	private static final Marker FATAL=MarkerFactory.getMarker("FATAL");
	@GetMapping("/home")
	public String getLogs()
	{
		LOGGER.error("This is error log..!");
		LOGGER.info("This is info log..!");
		
		LOGGER.debug("This is debug log..!");
		LOGGER.trace("This is trace log..!");
		LOGGER.info(FATAL, "This is fatal log..!");
		return "Hello";
	}
	
}
