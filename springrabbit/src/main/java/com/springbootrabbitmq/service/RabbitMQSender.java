package com.springbootrabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.springbootrabbitmq.model.Employee;

@Service
public class RabbitMQSender {
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${demo.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${demo.rabbitmq.routingkey}")
	private String routingkey;	
	
	public void send(Employee emp) {
		amqpTemplate.convertAndSend(exchange, routingkey, emp);
		System.out.println("Send msg = " + emp);
	    
	}
}