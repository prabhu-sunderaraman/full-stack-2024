package com.indium.springbootbasics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MyConfiguration {

    @Bean
    public List<String> passTimeActivities() {
        return Arrays.asList("eat", "sleep", "browse");
    }

    @Bean
    public List<String> passTimeActivities2() {
        return Arrays.asList("Paint", "Read", "Temple walks");
    }
}
