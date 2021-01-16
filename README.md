# market-cloud-gateway
This Spring Boot application is a microservice to handle gateway api in the market platform project.

#Note:
requirements: java 15 (also 11) or higher and maven 3.6.3
This microservice requires to run the following services:
- market-user-service
- market-order-service
- market-payment-service
- market-registry-service

#Enable Circuit Breaker:
add the following 2 dependencies into pom.xml:
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
    <version>2.2.6.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-circuitbreaker-reactor-resilience4j</artifactId>
</dependency>
```
Then define the Rest call endpoint fallBack and configure filters into application.yml