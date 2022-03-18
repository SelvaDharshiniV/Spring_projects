package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.controllers.StudenrController;
import com.example.demo.service.StudentService;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TestStudentController {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Mock
	private StudentService service;
	
	@InjectMocks
	private StudenrController controller;
	
	@Test
	@DisplayName("Test get all students method returns the name")
	void testForGetAllStudents()throws Exception {
		mockMvc.perform(get("/students"))
			.andExpect(status().is(200))
			.andExpect(content().string("Kamala,Vimala"));
	}
	@Test
	@DisplayName("Test get students by Id method returns the name Kamala for Id 1")
	void testForStudentById()throws Exception {
		mockMvc.perform(get("/students/1"))
			.andExpect(status().is(200))
			.andExpect(content().string("Kamala"));
	}
}
