package com.indium.calculatorapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CalculatorProducer {

    @Value("${calculator.topic}")
    private String calculatorTopic;

    @Autowired
    private KafkaTemplate<String, Integer> kafkaTemplate;

    @Scheduled(fixedRate = 10000)
    public void generateNumberForSquareOperation() {
        int number = (int) (Math.random() * 1000);
        kafkaTemplate.send(calculatorTopic, "square", number);
        System.out.println("*** Generated %s for square".formatted(number));
    }

    @Scheduled(fixedRate = 15000)
    public void generateNumberForIncrementOperation() {
        int number = (int) (Math.random() * 1000);
        kafkaTemplate.send(calculatorTopic, "increment", number);
        System.out.println("*** Generated %s for increment".formatted(number));
    }
}
