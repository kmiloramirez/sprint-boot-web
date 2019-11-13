package com.bolsadeideas.sprintboot.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

	@GetMapping("/string/{texto}")
	public String variables(@PathVariable(name = "texto") String textoOtro,Model model) {
		model.addAttribute("titulo","Recibir parametros de la ruta");
		model.addAttribute("resultado", "El resultado enviado en la ruta es: "+textoOtro);
		return "variables/ver";
	}
	
	@GetMapping("/string/{texto}/{numero}")
	public String variables(@PathVariable String texto,@PathVariable Integer numero,Model model) {
		model.addAttribute("titulo","Recibir parametros de la ruta");
		model.addAttribute("resultado", "El resultado enviado en la ruta es: "+texto+" El numero: "+numero);
		return "variables/ver";
	}
}
