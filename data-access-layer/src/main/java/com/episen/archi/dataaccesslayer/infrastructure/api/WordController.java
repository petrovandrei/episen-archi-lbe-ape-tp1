package com.episen.archi.dataaccesslayer.infrastructure.api;

import com.episen.archi.dataaccesslayer.domain.Word;
import com.episen.archi.dataaccesslayer.infrastructure.services.WordService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Optional;

@RestController
public class WordController {

    @Autowired
    WordService wordService;

    @PostMapping("/job/request")
    public void createJobRequest(@RequestBody Word word) throws IOException, InterruptedException {
        Word createdWord = wordService.createWord(word);

    }

    @RequestMapping("/job/word/{id}")
    public Word getWordById(@PathVariable("id") String id){
        return wordService.getWordById(id).get();
    }
}
