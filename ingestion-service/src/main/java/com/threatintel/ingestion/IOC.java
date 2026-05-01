package com.threatintel.ingestion;

public class IOC {

    private String ipAddress;
    private String domain;
    private String severity;

    public IOC() {
    }

    public IOC(String ipAddress, String domain, String severity) {
        this.ipAddress = ipAddress;
        this.domain = domain;
        this.severity = severity;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}