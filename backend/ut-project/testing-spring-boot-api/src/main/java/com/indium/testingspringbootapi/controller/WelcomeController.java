package com.indium.testingspringbootapi.controller;

import com.indium.testingspringbootapi.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @Autowired
    private TrainingService trainingService;

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping("/register")
    public String registerForTraining(@RequestParam String email) {
        boolean registered = trainingService.register(email);
        if (!registered) {
            return "Failed to register for training with email: " + email;
        }
        return "Registered for training with email: " + email;
    }
}
