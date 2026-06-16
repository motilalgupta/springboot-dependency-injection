# Spring Boot Constructor Injection

This project demonstrates Constructor-Based Dependency Injection in Spring Boot using the IoC Container and CommandLineRunner.

## Concepts Covered

* Spring Boot Auto Configuration
* Inversion of Control (IoC)
* Dependency Injection (DI)
* Constructor Injection
* Bean Management
* CommandLineRunner
* Interface-Based Design
* Loose Coupling

## Project Overview

The application injects a Notification dependency into the main Spring Boot application class using constructor injection.

When the application starts, the CommandLineRunner interface executes the notification service automatically.

## Project Structure

* Notification (Interface)
* Notification Implementation
* SpringBootPo01Application
* Spring Boot IoC Container

## Workflow

1. Spring Boot starts the application.
2. IoC Container creates and manages beans.
3. Notification bean is injected through the constructor.
4. CommandLineRunner executes after application startup.
5. Notification service is invoked.

## Key Features

* Constructor-based dependency injection
* Loose coupling through interfaces
* Automatic dependency management by Spring Boot
* Startup task execution using CommandLineRunner

## Technologies Used

* Java
* Spring Boot
* Maven
* IntelliJ IDEA

## Learning Outcomes

* Understand how Spring Boot manages beans.
* Learn constructor-based dependency injection.
* Understand the role of the IoC Container.
* Learn how CommandLineRunner works.
* Implement loose coupling using interfaces.

## Author

Motilal Gupta
