package com.indium.testingspringbootapi.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WelcomeControllerIntegrationTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void welcome() {
        String url = "http://localhost:" + port + "/welcome";
        String response = testRestTemplate.getForObject(url, String.class);
        assert response.equals("Hello, World!");
    }

    @Test
    public void welcomeWithAName() {
        String url = "http://localhost:" + port + "/hello/John";
        String response = testRestTemplate.getForObject(url, String.class);
        assert response.equals("Hello, John!");
    }

    @Test
    public void registerForTraining() {
        String email = "joe@gmail.com";
        String url = "http://localhost:" + port + "/register?email=" + email;
        String response = testRestTemplate.postForObject(url, null, String.class);
        assert response.equals("Registered for training with email: " + email);
    }
}