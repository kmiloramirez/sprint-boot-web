package com.bolsadeideas.sprintboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "redirect:https://www.google.com";
	}
	@GetMapping("/2")
	public String home2() {
		return "forward:app/";
	}

}
