package com.episen.archi.dataaccesslayer;

import com.episen.archi.dataaccesslayer.infrastructure.repositories.WordRepository;
import com.episen.archi.dataaccesslayer.infrastructure.services.WordService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataAccessLayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataAccessLayerApplication.class, args);
    }

}
