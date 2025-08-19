package com.cursos.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SaludoController {
	
	@GetMapping
	public String saludar() {
		return "Hola mundo";
	}
	
	@GetMapping("/{nombre}")
	public String saludar(@PathVariable String nombre) {
		return "Hola "+nombre;
	}
	
	@GetMapping("/{saludo}/{nombre}")
	public String saludar(@PathVariable String saludo,@PathVariable String nombre) {
		return saludo+nombre;
	}

}
