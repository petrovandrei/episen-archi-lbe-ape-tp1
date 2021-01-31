package com.episen.archi.dataaccesslayer.infrastructure.services;

import com.episen.archi.dataaccesslayer.domain.Word;
import com.episen.archi.dataaccesslayer.infrastructure.repositories.WordRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WordService {

    @Autowired
    public WordRepository wordRepository;

    public Word createWord(Word request){
        Word insertedWord = wordRepository.insert(request);
        return insertedWord;
    }

    public Optional<Word> getWordById(String id){
        Optional<Word> word = wordRepository.findById(id);
        return word;
    }
}
