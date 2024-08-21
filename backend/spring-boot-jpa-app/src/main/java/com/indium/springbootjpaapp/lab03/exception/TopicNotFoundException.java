package com.indium.springbootjpaapp.lab03.exception;


public class TopicNotFoundException extends RuntimeException {
    public TopicNotFoundException(String title) {
        super(title);
    }
}