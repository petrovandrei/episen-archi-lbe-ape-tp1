package com.episen.archi.back.infrastructure.services;

import com.episen.archi.back.domain.Word;
import com.episen.archi.back.infrastructure.repositories.WordRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Slf4j
public class JobService {
    @Autowired
    WordRepository wordRepository;


    public void reverse(String id) throws IOException {
        Word word = wordRepository.findById(id).orElse(new Word());
        String value = word.getValue();
        String reversed = reverseString(value);
        String filename = value + ".txt";
        Files.write(Paths.get(filename), reversed.getBytes(), StandardOpenOption.APPEND);
        log.info("---------> Wrote reversed word in file" + filename);
    }


    public String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}

