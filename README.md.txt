# Threat Intelligence Processing Platform

## Overview
This project is a microservices-based system that processes threat intelligence data using Kafka and REST APIs.

## Architecture
The system follows event-driven architecture with Kafka.

## Microservices
1. Ingestion Service (Port 8080)
   - Fetches threat data
   - Extracts IPs and domains
   - Sends data to Kafka

2. Processing Service (Port 8081)
   - Consumes Kafka data
   - Validates IOC data
   - Calls Ranking Service
   - Stores data in MySQL

3. Analytics Service (Port 8082)
   - Provides APIs to fetch stored IOC data

4. Ranking Service (Port 8083)
   - Calculates severity score for IPs

## Technologies Used
- Spring Boot
- Apache Kafka
- MySQL
- Docker
- REST APIs

## Workflow
1. Ingestion Service sends data to Kafka
2. Processing Service consumes data
3. Processing Service calls Ranking Service
4. Data stored in MySQL
5. Analytics Service provides results

## How to Run
1. Start Kafka using Docker
2. Run all services:
   - ingestion-service
   - processing-service
   - analytics-service
   - ranking-service

## API Endpoints
- http://localhost:8080/ingestion/send
- http://localhost:8082/analytics/iocs
- http://localhost:8083/ranking/score/{ip}

## Author
Atiqad Hayat