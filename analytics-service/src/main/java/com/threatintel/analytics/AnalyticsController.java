package com.threatintel.analytics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnalyticsController {

    private final IOCRepository iocRepository;

    public AnalyticsController(IOCRepository iocRepository) {
        this.iocRepository = iocRepository;
    }

    @GetMapping("/analytics/test")
    public String test() {
        return "Analytics Service is running";
    }

    @GetMapping("/analytics/iocs")
    public List<IOCEntity> getAllIocs() {
        return iocRepository.findAll();
    }
}