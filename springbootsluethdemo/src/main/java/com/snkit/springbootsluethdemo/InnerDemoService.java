package com.snkit.springbootsluethdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class InnerDemoService {
	private static Logger log = LoggerFactory.getLogger(InnerDemoService.class);
	public void logtest() {
		
		log.info("   From InnerDemoService service mehtod ::::::::::::::::::::::::::");
		
	}
}
