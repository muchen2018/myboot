package com.framework.modules.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	
	@RabbitListener(queues = "hello.queue1")
	public String processMessage1(String msg) {
		
		System.out.println(Thread.currentThread().getName() + " 接收到来自hello.queue1队列的消息：" + msg);
		return msg.toUpperCase();
	}

}
