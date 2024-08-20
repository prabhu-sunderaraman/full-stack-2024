package com.indium.springbootjdbclab03.exception;

public class TopicAlreadyExistsException extends RuntimeException {
    public TopicAlreadyExistsException(String title) {
        super(title);
    }
}
