package com.hepsiemlak.emlakoop.controller;

import com.hepsiemlak.emlakoop.model.Message;
import com.hepsiemlak.emlakoop.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {

    public final MessageRepository messageRepository;

    @GetMapping
    public List<Message> getMessages() {
        return messageRepository.getMessages();
    }
}
