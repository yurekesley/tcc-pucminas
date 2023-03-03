package com.boaentrega.apigatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@EnableDiscoveryClient
@EnableEurekaClient
@EnableWebFluxSecurity
@SpringBootApplication
public class ApigatwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApigatwayApplication.class, args);
    }

    @Bean
    public RouteLocator router(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/logistica/**").filters(f -> f.stripPrefix(1)).uri("lb://mslogistica"))
                .route(r -> r.path("/cadastro/**").filters(f -> f.stripPrefix(1)).uri("lb://mscadastro"))
                .route(r -> r.path("/gestao/**").filters(f -> f.stripPrefix(1)).uri("lb://msgestao"))
                .route(r -> r.path("/atendimento/**").filters(f -> f.stripPrefix(1)).uri("lb://msatendimento"))
                .build();
    }
}

