package com.indium.spring_boot_rest_api.lab05.exception;

public class TopicNotFoundException extends RuntimeException {
    public TopicNotFoundException(String title) {
        super("Topic with title " + title + " does not exist");
    }
}
