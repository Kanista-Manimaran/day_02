package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;


@RestController

public class controller {
	@RequestMapping("/hello")
	
	public String HelloMsg(){
		
		return "Hello SpringBoot!";
	
	}
	
}
