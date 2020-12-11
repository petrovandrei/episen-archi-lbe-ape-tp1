package com.episen.archi.back.domain;
import lombok.*;
import org.springframework.data.annotation.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class Word {

    @Id
    public String id;

    @NonNull
    public String value;

}

