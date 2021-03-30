package com.OrangeTalents.Orange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OrangeTalents.Orange.model.cadastroVacinaModel;
import com.OrangeTalents.Orange.repository.cadastroVacinaRepository;
import com.OrangeTalents.Orange.repository.cadastroUsuarioRepository;
import com.OrangeTalents.Orange.service.cadastroVacinaService;

@RestController
public class cadastroVacinaController {

	//Injetando o Repository e o Service no controler
	@Autowired
	private cadastroVacinaRepository repository;
		
	@Autowired
	private cadastroUsuarioRepository repositoryUsuario;
	
	@Autowired
	private cadastroVacinaService service;

	@PostMapping("/cadastroVacina")
	public cadastroVacinaModel cadastrarVacina(@RequestBody cadastroVacinaModel objetoCadastroVacina) {
		
		repository.save(objetoCadastroVacina);
		return objetoCadastroVacina;
	}
}
