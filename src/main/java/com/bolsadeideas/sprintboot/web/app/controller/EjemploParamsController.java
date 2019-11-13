package com.bolsadeideas.sprintboot.web.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {
	
	@GetMapping("/string")
	public String param(@RequestParam(name="texto",required = false,defaultValue = "algun valor..") String texto,Model model) {
		model.addAttribute("resultado", "El parametro enviado es : "+texto);
		return "params/ver";
	}
	
	@GetMapping("/mix")
	public String param(@RequestParam String saludo,@RequestParam Integer numero,Model model) {
		model.addAttribute("resultado", "El saludo enviado es : "+saludo +" y el numero es: "+numero);
		return "params/ver";
	}
	
	@GetMapping("/mix-params")
	public String param(HttpServletRequest request,Model model) {
		String saludo = request.getParameter("saludo");
		Integer numero;
		try {
			numero= Integer.parseInt(request.getParameter("numero"));
		}catch (Exception e) {
			numero=0;
		}
		model.addAttribute("resultado", "El saludo enviado es : "+saludo +" y el numero es: "+numero);
		return "params/ver";
	}
	

}
