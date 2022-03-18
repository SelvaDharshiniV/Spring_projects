package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.config.DirectExchangeConfig;
import com.example.demo.config.TopicExchangeConfig;
import com.example.demo.model.Student;

@Component
public class StudentConsumer {
	@RabbitListener(queues = DirectExchangeConfig.ROUTING_KEY)
    public void consumeMessageFromQueue(Student student) {
        System.out.println("Message recieved from queue : " + student);
    }
	
	//Fanout Exchange
	@RabbitListener(queues = "btech_2022")
    public void consumeMessageFromFanoutQueue1(Student student) {
        System.out.println("Message recieved from Fanout exchange1 : " + student);
    }
	@RabbitListener(queues = "mtech_2022")
    public void consumeMessageFromFanoutQueue2(Student student) {
        System.out.println("Message recieved from Fanout exchange2 : " + student);
    }
	
	//Topic Exchange
	@RabbitListener(queues = TopicExchangeConfig.QUEUE1)
	public void consumeMessageFromTopicExchangeQueue1(Student student) {
		System.out.println("Message recieved from  topic queue 1: " + student);
	}
	@RabbitListener(queues = TopicExchangeConfig.QUEUE2)
	public void consumeMessageFromTopicExchangeQueue2(Student student) {
		System.out.println("Message recieved from  topic queue 2: " + student);
	}
	@RabbitListener(queues = TopicExchangeConfig.QUEUE3)
	public void consumeMessageFromTopicExchangeQueue3(Student student) {
		System.out.println("Message recieved from  topic queue 3: " + student);
	}
}
