package com.example.demo.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class TeacherController {
	
	@GetMapping(path = "/teachers")
	public String getTeachers() {	
		List<String> list =Arrays.asList("kanic","selva");
		return list.toString();
	}
	@GetMapping(path = "/teachers/{dept}")
	public String getTeachersByDept(@PathVariable("dept") String dept) {
		
		List<String> list =Arrays.asList("kanic","selva");
		
		if(dept.equals("ece")) {
			list=Arrays.asList("raj","dharshini");
		}
		return list.toString();
	}
}
