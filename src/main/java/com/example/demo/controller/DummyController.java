package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	@GetMapping("/")
	public String root(){
		return "root";
	}

	@GetMapping("/ping")
	public String ping(){
		return "Success";
	}
}
