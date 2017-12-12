package com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Address;
import com.services.IAddressServices;

@RestController
public class HelloController { //a5aaaaaaaaaaa

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	IAddressServices iAddressServices;
	
	@RequestMapping("/hello")
	public String hello(@RequestParam String name) {
		logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
		return "Hello "+name;
	}
	
	@RequestMapping("/get/address")
	public List<Address> getAddress() {
		
		logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
		return iAddressServices.getEmpAddress();
	}
}
