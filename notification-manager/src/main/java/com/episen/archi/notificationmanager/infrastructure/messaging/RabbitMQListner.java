package com.episen.archi.notificationmanager.infrastructure.messaging;

import com.episen.archi.back.infrastructure.services.JobService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.nio.charset.StandardCharsets;

@Slf4j
public class RabbitMQListner implements MessageListener {




    @SneakyThrows
    public void onMessage(Message message) {
        log.info( "----> Message : " +message.toString() + " received");
        String id = new String(message.getBody(), StandardCharsets.UTF_8);
        log.info(id);

    }
}
