package com.episen.archi.front.infrastructure.api;

import com.episen.archi.front.domain.Word;
import com.episen.archi.front.infrastructure.messaging.RabbitMQSender;
import com.episen.archi.front.infrastructure.services.JobService;
import com.episen.archi.front.infrastructure.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;

@RestController
public class JobController {

    @Autowired
    WordService wordService;

    @Autowired
    JobService jobService;

    @Autowired
    RabbitMQSender rabbitMQSender;

    @PostMapping("/job/request")
    public void createJobRequest(@RequestBody Word word) throws IOException, InterruptedException {
        Word createdWord = wordService.createWord(word);
        jobService.requestJob(createdWord);
        Thread.sleep(3000);
        rabbitMQSender.send(word.getId());


    }

}
