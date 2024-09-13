package com.indium.testingspringbootapi.controller;

import com.indium.testingspringbootapi.service.TrainingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(WelcomeController.class)
public class WelcomeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TrainingService trainingService;

    //GET <server>/welcome -> "Hello, World!"
    @Test
    public void welcome() throws Exception {
        String url = "/welcome";
        mockMvc.perform(get(url))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }

    @Test
    public void welcomeWithAName() throws Exception {
        String url = "/hello/John";
        String output = "Hello, John!";
        mockMvc.perform(get(url))
                .andExpect(status().isOk())
                .andExpect(content().string(output));
    }

    @Test
    public void registerForTraining() throws Exception {
        String email = "john@gmail.com";
        when(trainingService.register(email)).thenReturn(true);
        String url = "/register";
        String output = "Registered for training with email: " + email;
        mockMvc.perform(
                        post((url))
                                .param("email", email))
                .andExpect(status().isOk())
                .andExpect(content().string(output));
        verify(trainingService, times(1)).register(email);
    }
}
