package com.episen.archi.front.infrastructure.reporsitories;

import com.episen.archi.front.domain.Word;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WordRepository extends MongoRepository<Word,String> {
}
