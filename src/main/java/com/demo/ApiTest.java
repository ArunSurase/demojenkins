package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/test")
public class ApiTest {

	@GetMapping("/apitest")
	public String testApi() {
		return "msg from api demo";
	}
}
