package com.OrangeTalents.Orange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.*;

import com.OrangeTalents.Orange.model.cadastroUsuarioModel;
import com.OrangeTalents.Orange.repository.cadastroUsuarioRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class cadastroUsuariosController implements WebMvcConfigurer{

	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/index.html");
	}
	
	@Autowired
	private cadastroUsuarioRepository repository;
	
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
