package com.indium.consumerapp;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MatchConsumer {


    @KafkaListener(topics = {"match-topic"}, groupId = "charts-group")
    public void generateCharts1OfMatchStatus(ConsumerRecord<String, String> matchRecord) {
        System.out.println("**** (1) CHARTS GROUP ****");
        System.out.println(matchRecord.key());
        System.out.println(matchRecord.value());
        System.out.println(matchRecord.offset());
    }

    @KafkaListener(topics = {"match-topic"}, groupId = "charts-group")
    public void generateCharts2OfMatchStatus(ConsumerRecord<String, String> matchRecord) {
        System.out.println("**** (2) CHARTS GROUP ****");
        System.out.println(matchRecord.key());
        System.out.println(matchRecord.value());
        System.out.println(matchRecord.offset());
    }


    // Ideally every consumer group id is implemented as a separate spring boot consumer application

//    @KafkaListener(topics = {"match-topic"}, groupId = "telegram-notification-group")
//    public void sendTelegramOfMatchStatus(ConsumerRecord<String, String> matchRecord) {
//        System.out.println("****Received in Telegram group ****");
//        System.out.println(matchRecord.key());
//        System.out.println(matchRecord.value());
//        System.out.println(matchRecord.offset());
//    }
//
//    @KafkaListener(topics = {"match-topic"}, groupId = "report-generation-group")
//    public void reportGenerationOfMatchStatus(ConsumerRecord<String, String> matchRecord) {
//        System.out.println("**** Received in REPORT GENERATION GROUP:   ****");
//        System.out.println(matchRecord.key());
//        System.out.println(matchRecord.value());
//        System.out.println(matchRecord.offset());
//    }
//
//    @KafkaListener(topics = {"match-topic"}, groupId = "dashboard-group")
//    public void dashboardOfMatchStatus(ConsumerRecord<String, String> matchRecord) {
//        System.out.println("**** Received in dashboard GENERATION GROUP:   ****");
//        System.out.println(matchRecord.key());
//        System.out.println(matchRecord.value());
//        System.out.println(matchRecord.offset());
//    }

}
