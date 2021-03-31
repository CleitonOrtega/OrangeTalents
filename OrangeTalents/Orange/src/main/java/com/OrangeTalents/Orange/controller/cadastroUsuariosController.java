package com.OrangeTalents.Orange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.OrangeTalents.Orange.model.cadastroUsuarioModel;
import com.OrangeTalents.Orange.service.cadastroUsuarioService;
import com.OrangeTalents.Orange.repository.cadastroUsuarioRepository;

@RestController
public class cadastroUsuariosController implements WebMvcConfigurer{

	//Para acessar a pagina atraves do Local Host (www.localhost:8080/)
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/cadastroUsuario.html");
	}
	
	//Injetando o Repository e o Service no controler
	@Autowired
	private cadastroUsuarioRepository repository;
	
	@Autowired
	private cadastroUsuarioService service;
	
	@PostMapping("/cadastroUsuario")
	public ResponseEntity<?> cadastrarUsuario(@RequestBody cadastroUsuarioModel objetoCadastroUsuario) {
		try {
			repository.save(objetoCadastroUsuario);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
}
