package com.snkit.springbootsluethdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service(value="helloService")
public class HelloService {
	
	private static Logger log = LoggerFactory.getLogger(HelloService.class);
	public void logtest() {
		log.info("   From HelloService service mehtod ::::::::::::::::::::::::::");
	}

}
