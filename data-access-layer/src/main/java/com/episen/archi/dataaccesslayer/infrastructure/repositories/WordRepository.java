package com.episen.archi.dataaccesslayer.infrastructure.repositories;

import com.episen.archi.dataaccesslayer.domain.Word;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface WordRepository extends MongoRepository<Word,String> {

}
