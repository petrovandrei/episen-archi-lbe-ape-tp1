package com.episen.archi.front.infrastructure.services;

import com.episen.archi.front.domain.Word;
import com.episen.archi.front.infrastructure.messaging.RabbitMQSender;
import com.episen.archi.front.infrastructure.reporsitories.WordRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class JobService {

    public String requestJob(Word word) throws IOException {

        String fileName = word.getValue() + ".txt";
        String data = "";
        FileOutputStream out = new FileOutputStream(fileName);
        out.write(data.getBytes());
        out.close();

        if (Files.exists(Path.of(fileName))) {
            return word.getId();
        } else {
            return null;
        }
    }



}
