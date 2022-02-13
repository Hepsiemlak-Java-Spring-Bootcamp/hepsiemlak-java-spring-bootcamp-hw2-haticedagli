package com.hepsiemlak.emlakoop.repository;

import com.hepsiemlak.emlakoop.model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepository {

    List<Message> messages = new ArrayList<>();

    public void addMessage(Message message){
        messages.add(message);
    }

    public List<Message> getMessages() {
        return messages;
    }
}
