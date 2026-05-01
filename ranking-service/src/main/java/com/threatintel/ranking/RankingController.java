package com.threatintel.ranking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RankingController {

    @GetMapping("/ranking/test")
    public String test() {
        return "Ranking Service is running";
    }

    @GetMapping("/ranking/score/{ip}")
    public String getSeverityScore(@PathVariable String ip) {

        if (ip.startsWith("192")) {
            return "LOW";
        } else if (ip.startsWith("10")) {
            return "MEDIUM";
        } else {
            return "HIGH";
        }
    }
}