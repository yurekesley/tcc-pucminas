package com.boaentrega.msatendimento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsatendimentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsatendimentoApplication.class, args);
    }

}
