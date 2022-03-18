package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	@RequestMapping(value="/greet",method=RequestMethod.GET)
	@ResponseBody
	public String message() {
		return "Spring MVC";
//		http://localhost:8096/welcome/greet
	}
	@RequestMapping(value="/thanks",method=RequestMethod.GET)
	@ResponseBody
	public String message1() {
		return "Thanks for using Spring MVC";
//		http://localhost:8096/welcome/thanks
	}
}
