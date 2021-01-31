package com.episen.archi.websockethub.infrastructure.services;

import com.episen.archi.websockethub.domain.Note;
import com.google.firebase.messaging.FirebaseMessagingException;
import org.springframework.stereotype.Service;
import com.google.firebase.messaging.*;

@Service
public class FirebaseMessagingService {

    private final FirebaseMessaging firebaseMessaging;

    public FirebaseMessagingService(FirebaseMessaging firebaseMessaging) {
        this.firebaseMessaging = firebaseMessaging;
    }


    public String sendNotification(Note note, String token) throws FirebaseMessagingException {

        Notification notification = Notification
                .builder()
                .setBody(note.getMessage())
                .build();

        Message message = Message
                .builder()
                .setToken(token)
                .setNotification(notification)
                .build();

        return firebaseMessaging.send(message);
    }


}
