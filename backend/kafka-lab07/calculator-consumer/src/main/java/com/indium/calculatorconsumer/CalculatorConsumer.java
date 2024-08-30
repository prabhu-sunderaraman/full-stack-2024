package com.indium.calculatorconsumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CalculatorConsumer {

    @KafkaListener(topics = "${calculator.topic}")
    public void processNumber(ConsumerRecord<String, Integer> consumerRecord) {
        String operation = consumerRecord.key();
        Integer number = consumerRecord.value();
        System.out.println("*** Received %s for %s".formatted(number, operation));
        try {
            int result = switch (operation) {
                case "square" -> number * number;
                case "increment" -> number + 1;
                default -> throw new IllegalArgumentException("Invalid operation: " + operation);
            };
            System.out.println("Result of %s for %s is %s".formatted(number, operation, result));
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
