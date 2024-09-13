package com.indium.testingspringbootapi.controller;

import com.indium.testingspringbootapi.service.TrainingService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @Autowired
    private TrainingService trainingService;

    private static Logger logger = org.slf4j.LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/welcome")
    public String welcome() {
        System.out.println("****welcome called****");
        logger.info("****welcome called****");
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        if (name.equalsIgnoreCase("error")) {
            logger.warn("****useless name provided {}****", name);
        }
        return "Hello, " + name + "!";
    }

    @PostMapping("/register")
    public String registerForTraining(@RequestParam String email) {
        try {
            boolean registered = trainingService.register(email);
            if (!registered) {
                return "Failed to register for training with email: " + email;
            }
            logger.info("****Registered for training with email: {}****", email);
        } catch (Exception e) {
            logger.error("****Failed to register for training with email: {}, error is {}****", email, e.getMessage());
        }
        return "Registered for training with email: " + email;
    }
}
