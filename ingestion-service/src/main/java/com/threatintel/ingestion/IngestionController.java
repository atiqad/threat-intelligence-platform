package com.threatintel.ingestion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngestionController {

    private final KafkaProducerService producerService;

    public IngestionController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/ingestion/test")
    public String test() {
        return "Ingestion Service is running successfully";
    }

    @GetMapping("/ingestion/data")
    public List<IOC> getThreatData() {
        return List.of(
                new IOC("192.168.1.1", "malicious.com", "UNKNOWN"),
                new IOC("10.0.0.5", "phishing.net", "UNKNOWN")
        );
    }

    @GetMapping("/ingestion/send")
    public String sendDataToKafka() {
        List<IOC> data = getThreatData();

        for (IOC ioc : data) {
            producerService.sendMessage(ioc.getIpAddress() + "," + ioc.getDomain());
        }

        return "Data sent to Kafka";
    }
}