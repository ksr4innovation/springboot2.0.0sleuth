package com.snkit.springbootsluethdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SluethDemoController {

	private static Logger log = LoggerFactory.getLogger(SluethDemoController.class);
	@Autowired
	HelloService helloService;
	@Autowired
	DemoService demoService;
	
	@GetMapping(value="/sayHi")
	public String sayHi() {
		
		log.info(" From hello world controlle ===============================");
		
		helloService.logtest();
		
		demoService.logtest();
		
		return "Hello";
	}
}
