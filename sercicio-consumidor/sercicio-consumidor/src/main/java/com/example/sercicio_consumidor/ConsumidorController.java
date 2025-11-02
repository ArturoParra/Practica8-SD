package com.example.sercicio_consumidor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumidorController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/saludo-completo/{nombre}")
    public String getSaludoCompleto(@PathVariable String nombre) {
        String url = "http://servicio-proveedor/saludo/" + nombre;

        // Llama al otro servicio
        String respuestaDelProveedor = restTemplate.getForObject(url, String.class);

        return "Respuesta del consumidor: " + respuestaDelProveedor;
    }
}

