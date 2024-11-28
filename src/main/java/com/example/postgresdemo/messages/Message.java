package com.example.postgresdemo.messages;

import org.springframework.stereotype.Component;

@Component
public class Message {

    private final String message;

    public Message() {
        System.out.println("This is the message from the default constructor");
        this.message = "This is the default message";
    }

    public Message(String info) {
        this.message = info;
    }
}
