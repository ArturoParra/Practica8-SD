package com.example.sercicio_consumidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // <-- Habilita el cliente (en versiones modernas de Spring, esto puede ser automático)
public class SercicioConsumidorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SercicioConsumidorApplication.class, args);
    }
}