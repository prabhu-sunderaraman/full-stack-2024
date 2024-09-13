package com.indium.testingspringbootapi.service;

import org.springframework.stereotype.Service;

@Service
public class TrainingService {
    public boolean register(String email) {
        // call repository to save email or an external service
        return true;
    }
}
