# 🎥 Video Streaming App - Microservice Architecture with Spring Boot

This is a **video streaming application** built using a **Spring Boot microservices architecture**. It features service discovery via **Eureka Discovery Server** and inter-service communication through **Feign Clients**.

---

## 🧱 Microservices Overview

The system is composed of the following components:

| Service           | Description                                         | Port  |
|-------------------|-----------------------------------------------------|-------|
| Eureka Server     | Service registry and discovery                      | 8761  |
| API Gateway       | (Optional) Routes requests to appropriate services | 8080  |
| User Service      | Handles user registration and authentication        | 8081  |
| Video Service     | Manages video metadata (title, description, URL)    | 8082  |
| Streaming Service | Handles streaming logic and playback requests       | 8083  |
| Comment Service   | Enables users to add comments on videos             | 8084  |

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Cloud (Eureka, Feign)
- Spring Web, Spring Data JPA
- H2 / MySQL / PostgreSQL (choose per service)
- Spring Security (optional)
- Docker & Docker Compose (optional for deployment)
- Lombok
- Maven

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 17+
- Maven
- Docker (optional)
- IDE like IntelliJ or VSCode

---

### 📦 Clone and Build

```bash
git clone https://github.com/your-username/video-streaming-app.git
cd video-streaming-app
mvn clean install
