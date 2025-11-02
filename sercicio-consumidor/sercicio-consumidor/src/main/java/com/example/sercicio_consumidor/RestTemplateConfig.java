package com.example.sercicio_consumidor;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced // <-- Esto habilita el balanceo de carga con Eureka
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

