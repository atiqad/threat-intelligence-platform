package com.threatintel.processing;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KafkaConsumerService {

    private final IOCRepository iocRepository;

    public KafkaConsumerService(IOCRepository iocRepository) {
        this.iocRepository = iocRepository;
    }

    @KafkaListener(topics = "ioc-topic", groupId = "processing-group")
    public void consume(String message) {
        System.out.println("Received from Kafka: " + message);

        String[] parts = message.split(",");
        String ip = parts[0];
        String domain = parts[1];

        String severity = getSeverityFromRankingService(ip);

        IOCEntity ioc = new IOCEntity(ip, domain, severity);
        iocRepository.save(ioc);

        System.out.println("Saved to MySQL: " + ip + " " + domain + " " + severity);
    }

    private String getSeverityFromRankingService(String ip) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject(
                    "http://localhost:8083/ranking/score/" + ip,
                    String.class
            );
        } catch (Exception e) {
            return "UNKNOWN";
        }
    }
}