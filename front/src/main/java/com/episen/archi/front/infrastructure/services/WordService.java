package com.episen.archi.front.infrastructure.services;

import com.episen.archi.front.domain.Word;
import com.episen.archi.front.infrastructure.reporsitories.WordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {

    @Autowired
    public WordRepository wordRepository;

    public Word createWord(Word request){
        Word insertedWord = wordRepository.insert(request);
        return insertedWord;
    }
}
