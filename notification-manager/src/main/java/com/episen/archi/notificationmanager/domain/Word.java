package com.episen.archi.notificationmanager.domain;
import lombok.*;
import org.springframework.data.annotation.Id;



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

