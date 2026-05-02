# Threat Intelligence Processing Platform using Microservices and Kafka

## Course Information
Course: COMP-370 Software Construction and Development  
Project Type: Course Completion Project (CCP)

---

## Project Overview
This project is a microservices-based cybersecurity platform designed to process Indicators of Compromise (IOCs) such as IP addresses and domain names. The system uses Apache Kafka for asynchronous communication between services and REST APIs for synchronous communication.

The platform simulates a real-world threat intelligence pipeline where data is ingested, processed, ranked, and stored for further analysis.

---

## Objectives
- Design and implement a microservices architecture
- Use Apache Kafka for event-driven communication
- Apply REST APIs for service interaction
- Implement persistent storage using MySQL
- Demonstrate modular and scalable system design

---

## System Architecture
The system is divided into multiple independent microservices:

- Ingestion Service
- Processing Service
- Ranking Service
- Analytics Service

Each service is responsible for a specific task and communicates with others through Kafka and REST APIs.

---

## Key Features
- Microservices-based architecture
- Kafka Producer and Consumer implementation
- Real-time data processing pipeline
- REST API communication between services
- MySQL database integration
- Scalable and loosely coupled design

---

## Technologies Used
- Java
- Spring Boot
- Apache Kafka
- MySQL
- REST APIs
- Docker (optional)
- Git and GitHub

---

## System Design Diagrams
The following system design diagrams are included:

- Architecture Diagram
- Sequence Diagram
- Activity Diagram

These diagrams are available in the following folder:

documentation-diagrams/

---

## Project Structure
```text
threat-intelligence-platform/
├── ingestion-service
├── processing-service
├── ranking-service
├── analytics-service
├── documentation
├── documentation-diagrams
├── docker-compose.yml
└── README.md

## Documentation

Full CCP report is available here:
documentation/CCP-Report.pdf

## System Design Diagrams

Architecture, Sequence, and Activity diagrams are included in:
documentation-diagrams/

How to Run the Project
Clone the repository
Open the project in IntelliJ IDEA
Configure MySQL database
Start Apache Kafka and Zookeeper
Run all microservices
Access APIs using Postman
Team Collaboration

This project was developed using GitHub for version control and collaboration. Work was divided among team members, including backend service implementation, documentation, and system design diagrams. Changes were managed through commits and pull requests.

Contributors
Atiqad Hayat — Microservices implementation, Kafka integration, backend development
Bilal Samii — Documentation, system design diagrams (architecture, sequence, activity)
