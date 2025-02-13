# Survey Application (WIP)

## Overview

This repository contains a Spring Boot application that implements a survey system using Domain-Driven Design (DDD) principles. The application allows users to create, publish, and respond to surveys. It is designed with a clear separation of concerns, adhering to DDD principles to ensure maintainability and scalability.

## Features

- Create and manage surveys with various question types.
- Publish surveys and collect responses.
- View survey results and analytics.
- User authentication and authorization (optional).

## Tech Stack

- **Backend**: Spring Boot, Spring Data JPA, Hibernate
- **Database**: H2 (in-memory database for development; can be replaced with MySQL, PostgreSQL, etc.)
- **Build Tool**: Gradle
- **Validation**: Spring Validation
- **Security**: Spring Security (optional)
- **Testing**: JUnit, Mockito

## Project Structure

The project follows a typical DDD structure with the following main packages:

- **domain**: Contains the core business logic, including entities, repositories, and domain services.
- **application**: Contains application services that orchestrate the use cases of the application.
- **infrastructure**: Contains technical details and implementations, such as database configurations and external service clients.
- **interfaces**: Contains user interfaces, such as web controllers or command-line interfaces.

```plaintext
src/main/java/com/projects/survey/
├── application/
│   ├── services/
│   └── dtos/
├── domain/
│   ├── model/
│   ├── repositories/
│   └── services/
├── infrastructure/
│   ├── config/
│   ├── persistence/
│   └── external/
└── interfaces/
    ├── web/
    │   ├── controllers/
    └── cli/
```
Getting Started
Prerequisites
Java 17
Gradle 7.x
Your preferred IDE (e.g., IntelliJ IDEA, Eclipse)
Setup
Clone the repository:

````
git clone https://github.com/ValarMorghulis09/survey
cd survey
````
Build the project:

````
./gradlew build
Run the application:


./gradlew bootRun
Access the application:
````

The application will be available at http://localhost:8080.

The H2 database console can be accessed at http://localhost:8080/h2-console (if enabled).

Configuration
Database Configuration: Update the application.properties file to configure your database settings.

Security Configuration: If using Spring Security, configure security settings in the application.properties file or a separate security configuration class.
Usage

Create a Survey: Use the /api/surveys endpoint to create a new survey.

Publish a Survey: Use the /api/surveys/{id}/publish endpoint to publish a survey.


Submit a Response: Use the /api/responses endpoint to submit a response to a survey.


View Results: Use the /api/surveys/{id}/results endpoint to view the results of a survey.

