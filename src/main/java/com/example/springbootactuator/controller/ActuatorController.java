package com.example.springbootactuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springbootactuator")
public class ActuatorController {
	
	@GetMapping("/endpoint")
	public String testEndpoint() {
		return "SpringbootActuator POC";
	}

}
