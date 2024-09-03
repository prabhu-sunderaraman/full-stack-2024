package com.indium.producerapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockController {
    List<String> stockList = List.of("AAPL", "GOOGL", "AMZN", "TSLA", "MSFT", "FB", "NVDA", "INTC", "ADBE", "PYPL");

    @Autowired
    private KafkaTemplate<String, Double> kafkaTemplate;

    @PostMapping("/stock/{symbol}")
    public String publishCurrentMarketPrice(@PathVariable String symbol) {
        double cmp = Math.random() * 1000;
        kafkaTemplate.send("stock-topic", symbol, cmp);
        return "Stock price of %s pushed to Kafka topic successfully".formatted(symbol);
    }

    @PostMapping("/stocks/cmp")
    public String getCurrentMarketPrice() {
        stockList.forEach(stock -> {
            double cmp = Math.random() * 1000;
//            Message message = MessageBuilder.createMessage(cmp, MessageHeaders.);
            kafkaTemplate.send("stock-topic", stock, cmp);
//            kafkaTemplate.send("stock-topic", (int) (Math.random() * 3), stock, cmp); // Not recommended
        });
        return "Stock prices pushed to Kafka topic successfully";
    }

}
