package com.example.demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FanoutExchangeConfig {
	public static final String EXCHANGE_NAME = "pass_fout_exchange";
	public static final String QUEUE1 = "btech_2022";
	public static final String QUEUE2 = "mtech_2022";

	@Bean
	public Queue myqueue1() {
		return new Queue(QUEUE1,false);	
	}
	@Bean
	public Queue myqueue2() {
		return new Queue(QUEUE2,false);	
	}
	@Bean
	public FanoutExchange fanOutExchange () {
		return new FanoutExchange(EXCHANGE_NAME);
	}
	
	@Bean
	public Binding fanOutBinding1() {

		return  BindingBuilder.bind(myqueue1()).to(fanOutExchange());
	}
	@Bean
	public Binding fanOutBinding2(FanoutExchange foutExchange) {

		return  BindingBuilder.bind(myqueue2()).to(foutExchange);
	}
}
