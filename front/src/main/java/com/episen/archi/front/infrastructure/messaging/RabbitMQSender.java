package com.episen.archi.front.infrastructure.messaging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.exchange}")
    private String exchange;

    @Value("${spring.rabbitmq.routingkey}")
    private String routingkey;

    public void send(String id) {
        Message msg = MessageBuilder.withBody(id.getBytes()).setContentType(MessageProperties.CONTENT_TYPE_JSON).build();
        rabbitTemplate.convertAndSend(exchange,routingkey,msg);
        log.info("-----> Message : " + msg.toString() + " sent");
    }
}
