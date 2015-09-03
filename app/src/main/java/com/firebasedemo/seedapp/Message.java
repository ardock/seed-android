package com.firebasedemo.seedapp;

public class Message {
    private String email;
    private String text;

    public Message() {
    }

    public Message(String email, String text) {
        this.email = email;
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public String getText() {
        return text;
    }
}
