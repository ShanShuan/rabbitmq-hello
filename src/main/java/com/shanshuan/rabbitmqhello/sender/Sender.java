package com.shanshuan.rabbitmqhello.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public  void sned(){
        String cotext="hello "+new Date();
        this.rabbitTemplate.convertAndSend("hello",cotext);
    }
}
