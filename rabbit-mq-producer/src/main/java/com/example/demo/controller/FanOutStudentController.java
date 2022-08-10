package com.example.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class FanOutStudentController {

//	@PostMapping(path="/fan/students")
//	public Student
	
	@Autowired
	private RabbitTemplate template;
	
	@PostMapping(value = "/fan/students")
	public String addStudent(@RequestBody Student entity) {

	    String routingKey = "";

	template.convertAndSend("ACETMK",routingKey,entity);

	 return "One student details is send";
	}

}
