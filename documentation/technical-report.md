# Technical Report

## Project: Threat Intelligence Platform

This project is based on microservices architecture using Kafka for asynchronous communication.

## Workflow
1. Ingestion Service collects data
2. Data sent to Kafka
3. Processing Service consumes data
4. Ranking Service calculates severity
5. Data stored in MySQL
6. Analytics Service provides results

## Team Contribution

- Atiqad Hayat:
  - Ingestion Service
  - Kafka integration
  - Processing Service

- Bilal Sami:
  - Documentation
  - Architecture explanation
  - Testing APIs
  - GitHub collaboration