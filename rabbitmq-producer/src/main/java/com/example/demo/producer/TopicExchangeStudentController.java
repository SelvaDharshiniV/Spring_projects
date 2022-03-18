package com.example.demo.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.TopicExchangeConfig;
import com.example.demo.model.Student;

@RestController
@RequestMapping(path="/api/v3")
public class TopicExchangeStudentController {
	@Autowired
	private RabbitTemplate template;

	@PostMapping(path = "/students/{key}")
	public String producer(@RequestBody Student student,@PathVariable("key") int key) {
	 String routeKey="tp.excela.2022";
	 if(key==2022) {
		 routeKey="tp.campus.2022";
	 }
		template.convertAndSend(
				TopicExchangeConfig.EXCHANGE_NAME,
				routeKey, student);
		return "Message sent to Topic exchange ";
	}
}
