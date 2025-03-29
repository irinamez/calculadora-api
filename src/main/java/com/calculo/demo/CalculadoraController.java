package com.calculo.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CalculadoraController {
    

	@GetMapping("/sumar")
	public ResponseEntity<Integer> sumar(@RequestParam int a, @RequestParam int b) {

		return ResponseEntity.ok(a + b);
	}
}