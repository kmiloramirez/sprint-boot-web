package com.bolsadeideas.sprintboot.web.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.sprintboot.web.app.model.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	@Value("${texto.indexcontroller.index.titulo}")
	private String textoIndex;
	@Value("${texto.indexcontroller.perfil.titulo}")
	private String textoPerfil;
	@GetMapping(value= {"/index","/home","/",""})
	public String index(Model model) {
		model.addAttribute("titulo", textoIndex);
		return "index";
	}

	@GetMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario= new Usuario();
		usuario.setNombre("juan");
		usuario.setApellido("ramirez");
		
		model.addAttribute("titulo", textoPerfil+" "+usuario.getNombre());
		model.addAttribute("usuario", usuario);
		return "perfil";
	}
}
