package com.episen.archi.front.domain;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Document
public class Word {

    @Id
    public String id;

    @NonNull
    public String value;

    public Word(@NonNull String value) {
        this.value = value;
    }
}
