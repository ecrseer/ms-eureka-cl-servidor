package com.example.servidoreurekagabrieltp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServidorEurekaGabrielTp1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServidorEurekaGabrielTp1Application.class, args);
    }

}
