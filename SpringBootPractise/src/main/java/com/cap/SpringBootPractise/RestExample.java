package com.cap.SpringBootPractise;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestExample {
	
	@RequestMapping("/Hello")
	public String sayHello()
	{
		return "Hello! How are you";
	}

}
