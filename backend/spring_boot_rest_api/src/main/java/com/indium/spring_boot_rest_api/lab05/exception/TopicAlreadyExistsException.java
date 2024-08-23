package com.indium.spring_boot_rest_api.lab05.exception;

public class TopicAlreadyExistsException extends RuntimeException {
    public TopicAlreadyExistsException(String title) {
        super("Topic with title " + title + " already exists");
    }
}
