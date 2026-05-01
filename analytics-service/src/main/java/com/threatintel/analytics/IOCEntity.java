package com.threatintel.analytics;

import jakarta.persistence.*;

@Entity
@Table(name = "iocs")
public class IOCEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ipAddress;
    private String domain;
    private String severity;

    public IOCEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getDomain() {
        return domain;
    }

    public String getSeverity() {
        return severity;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}