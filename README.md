# bilibili-eureka

This repository hosts the Eureka service registry for the Bilibili platform. It provides:

- A standalone Spring Boot application annotated with `@EnableEurekaServer`.
- Registration and discovery of all other microservices (app, demo-service, API gateway).
- Default configuration listening on port `15006`.
