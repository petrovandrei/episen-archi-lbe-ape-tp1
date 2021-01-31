package com.episen.archi.websockethub.infrastructure.services;

import com.episen.archi.websockethub.domain.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
public class WSNotificationService{

    private Map<String, Note> process = new HashMap<String, Note>();

    @Autowired
    private SimpMessagingTemplate messagingTemplate;


    @PostMapping(value="/notification")
    public void sendAlert(@RequestBody Note notification){
        process.put( "notification",notification);
        messagingTemplate.convertAndSend("/topic/notification", process);
    }
}
