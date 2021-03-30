package com.OrangeTalents.Orange.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrangeTalents.Orange.repository.cadastroVacinaRepository;

@Service
public class cadastroVacinaService {

	@Autowired
	private cadastroVacinaRepository repository;
}
