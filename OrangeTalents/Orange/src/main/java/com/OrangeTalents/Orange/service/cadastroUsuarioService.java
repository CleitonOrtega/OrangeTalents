package com.OrangeTalents.Orange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrangeTalents.Orange.repository.cadastroUsuarioRepository;

@Service
public class cadastroUsuarioService {

	@Autowired
	private cadastroUsuarioRepository repository;
	
}
