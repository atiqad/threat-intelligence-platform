package com.threatintel.processing;

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

    public IOCEntity(String ipAddress, String domain, String severity) {
        this.ipAddress = ipAddress;
        this.domain = domain;
        this.severity = severity;
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