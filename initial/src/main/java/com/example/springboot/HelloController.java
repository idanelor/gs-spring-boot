package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dchealth.entity.common.YunUsers;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}


	@GetMapping("/configureSSO")
	public List<YunUsers> configureSSO() {
		return "SSO!";
	}
}
