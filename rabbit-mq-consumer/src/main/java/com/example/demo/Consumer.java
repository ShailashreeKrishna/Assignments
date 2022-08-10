package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.direct.config.DirectExchangeConfig;
import com.example.demo.model.Student;

@Component
public class Consumer {
	
	@RabbitListener(queues = DirectExchangeConfig.ROUTING_KEY)
	public void consumeMessage(String msg) {
		System.out.println("Message received from queue : " +msg);
	}
	//for fanout exchange
	@RabbitListener(queues = "dhana.ece.student")
    public void consumeMessageFromQueue1(Student entity) {
        System.out.println("Message recieved In ONE queue : " + entity);
    }

    @RabbitListener(queues = "krish.ece.student")
    public void consumeMessageFromQueue2(Student records) {
        System.out.println("Message recieved In SECOND queue : " + records);
    }

}
