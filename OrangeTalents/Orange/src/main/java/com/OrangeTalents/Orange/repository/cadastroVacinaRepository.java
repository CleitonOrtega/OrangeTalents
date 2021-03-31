package com.OrangeTalents.Orange.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OrangeTalents.Orange.model.cadastroUsuarioModel;
import com.OrangeTalents.Orange.model.cadastroVacinaModel;

public interface cadastroVacinaRepository extends JpaRepository<cadastroVacinaModel,Long>{

	public Optional<cadastroUsuarioModel> findByEmailUsuario(String email);
	
}
