package com.example.sercicio_proveedor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludo/{nombre}")
    public String getSaludo(@PathVariable String nombre) {
        return "¡Hola, " + nombre + "! (Respuesta desde servicio-proveedor)";
    }
}