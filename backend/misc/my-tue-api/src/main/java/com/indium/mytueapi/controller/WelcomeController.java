package com.indium.mytueapi.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to My Tue API!";
    }

    @GetMapping("/now")
    public String now() {
        return "Current time is: " + java.time.LocalDateTime.now();
    }

    @GetMapping("/ip")
    public String getIp(HttpServletRequest request) {
        return "Your IP address is: " + request.getServerName() + ":" + request.getServerPort();
    }


}
