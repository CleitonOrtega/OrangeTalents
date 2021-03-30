package com.OrangeTalents.Orange.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

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
	public cadastroUsuarioModel cadastrarUsuario(@RequestBody cadastroUsuarioModel objetoCadastroUsuario) {
		cadastroUsuarioModel usuario = new cadastroUsuarioModel("Cleiton","c.ortega200935@gmail.com","12345678910");
		repository.save(objetoCadastroUsuario);
		return objetoCadastroUsuario;
	}
	
}
