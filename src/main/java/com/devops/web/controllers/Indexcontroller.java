package com.devops.web.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Indexcontroller {
	 @RequestMapping("/")
	public String home() {
		
		return "index";
		
	}

}
