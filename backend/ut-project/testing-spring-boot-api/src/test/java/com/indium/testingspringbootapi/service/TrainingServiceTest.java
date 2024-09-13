package com.indium.testingspringbootapi.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TrainingServiceTest {
    @Autowired
    private TrainingService trainingService;

    @Test
    public void register() {
        String email = "joe@gmail.com";
        boolean registered = trainingService.register(email);
        assertTrue(registered);
    }
}
