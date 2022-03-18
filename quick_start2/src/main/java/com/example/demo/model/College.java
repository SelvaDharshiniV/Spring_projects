package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class College {
	@Autowired
	private Professor prof;
	public Professor getProf() {
		return this.prof;
	}
}
