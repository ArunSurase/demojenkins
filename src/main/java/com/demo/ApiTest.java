package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {

	@GetMapping(value = "/apitest")
	public String testApi() {
		return "msg from api demo";
	}
}
