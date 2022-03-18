package com.example.demo.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.DirectExchangeConfig;
import com.example.demo.model.Student;


@RestController
@RequestMapping(path="/api/v1")
public class DirectExchangeStudentController {
	
	@Autowired
	private RabbitTemplate template;

	@PostMapping(path = "/students")
	public String producer(@RequestBody Student student) {
	 template.convertAndSend(DirectExchangeConfig.EXCHANGE_NAME,
			 					DirectExchangeConfig.ROUTING_KEY, student);
		return "Message sent ";
	}

}
