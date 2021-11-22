package com.loginAssign.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	private String home() {
       return "index";
	}
	
	@RequestMapping("/index")
	private String index() {
		return "redirect:/";
	}
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	private String login() {
		return "main";
		
	}

}
