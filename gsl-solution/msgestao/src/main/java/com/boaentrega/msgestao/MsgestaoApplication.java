package com.boaentrega.msgestao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsgestaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsgestaoApplication.class, args);
    }

}
