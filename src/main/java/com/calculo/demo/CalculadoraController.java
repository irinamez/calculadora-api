package com.calculo.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculadoraController {
    
    private static final String API_KEY = "mi-clave-segura";

    @GetMapping("/sumar")
    public ResponseEntity<Integer> sumar(
            @RequestParam int a, @RequestParam int b,
            @RequestParam String apiKey) {

        if (!API_KEY.equals(apiKey)) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
        return ResponseEntity.ok(a + b);
    }
}