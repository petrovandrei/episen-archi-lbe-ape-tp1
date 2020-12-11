package com.episen.archi.back.infrastructure.repositories;

import com.episen.archi.back.domain.Word;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WordRepository extends MongoRepository<Word,String> {
}
