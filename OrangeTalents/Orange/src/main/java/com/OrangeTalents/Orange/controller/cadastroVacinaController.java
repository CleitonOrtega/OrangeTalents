package com.OrangeTalents.Orange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.*;

import com.OrangeTalents.Orange.model.cadastroVacinaModel;
import com.OrangeTalents.Orange.repository.cadastroVacinaRepository;
import com.OrangeTalents.Orange.repository.cadastroUsuarioRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class cadastroVacinaController {

	@Autowired
	private cadastroVacinaRepository repository;
		
	@Autowired
	private cadastroUsuarioRepository repositoryUsuario;

	@PostMapping("/cadastroVacina")
	public ResponseEntity<?> cadastrarVacina(@RequestBody cadastroVacinaModel objetoCadastroVacina) {
		try {
			if(repositoryUsuario.findByEmail(objetoCadastroVacina.getEmailUsuario()).isPresent()) {
				repository.save(objetoCadastroVacina);
				return ResponseEntity.status(HttpStatus.CREATED).build();
			}else{
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		}catch (Exception e){
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
}
