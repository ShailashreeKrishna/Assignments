package com.example.demo.controller;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.direct.config.TopicExchangeConfig;
import com.example.demo.model.Student;

@RestController
public class TopicExchangeController {
	
	@Autowired
	@Qualifier("second")
	private RabbitTemplate template;
	
	@PostMapping(path="/topic/students")
	public String addStudent(@RequestBody Student entity) {

	    String routingKey = "award.ece.2000";
	    
	    if(entity.getId()>200) {
	    	routingKey="award.cse.2000";
	    }

	template.convertAndSend(TopicExchangeConfig.EXCHANGE_NAME,routingKey,entity);

	 return "One student details is send";
	}

}
