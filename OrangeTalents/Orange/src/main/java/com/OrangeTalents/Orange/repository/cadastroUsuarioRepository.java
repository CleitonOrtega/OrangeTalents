package com.OrangeTalents.Orange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OrangeTalents.Orange.model.cadastroUsuarioModel;

import java.util.Optional;

public interface cadastroUsuarioRepository extends JpaRepository<cadastroUsuarioModel, Long>{
	
	public Optional<cadastroUsuarioModel> findByEmail(String email);
	
}
