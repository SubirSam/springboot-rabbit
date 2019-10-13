package com.springrabbit.resources;

import com.springrabbit.repository.Employee;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * TestConsumer
 */
@Component
public class TestConsumer {

    @RabbitListener(queues = "${demo.rabbitmq.queue}")
	public void recievedMessage(Employee employee) {
		System.out.println("Recieved Message From RabbitMQ: " + employee);
	}
}