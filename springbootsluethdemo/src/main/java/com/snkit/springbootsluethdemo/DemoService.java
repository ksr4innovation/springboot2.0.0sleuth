package com.snkit.springbootsluethdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="demoService")
public class DemoService {
	
	
	private static Logger log = LoggerFactory.getLogger(DemoService.class);
	
	@Autowired
	InnerDemoService innerDemoService;
	
	public void logtest() {
		
		log.info("   From Demo service mehtod ::::::::::::::::::::::::::");
		
		innerDemoService.logtest();
		
	}

}
