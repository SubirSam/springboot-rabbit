package com.springbootrabbitmq.resources;

import com.springbootrabbitmq.model.Employee;
import com.springbootrabbitmq.service.RabbitMQSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoRestController
 */
@RestController
@RequestMapping
public class DemoRestController {
    @Autowired
	RabbitMQSender rabbitMQSender;
    
    
    @GetMapping(value="/hello")
    public String getHelloWorld() {
        return "Hello World!!!";
    }
    
	

	@GetMapping(value = "/producer/{employeeName}/{empId}")
	public String producer(@PathVariable("employeeName") String employeeName, @PathVariable("empId") String empId) {
	
	Employee emp=new Employee();
	emp.setEmpId(empId);
	emp.setEmpName(employeeName);
		rabbitMQSender.send(emp);
		return "Message sent to the RabbitMQ ";
	}




}