package com.OrangeTalents.Orange.model;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name="tb_cadastroVacina")
public class cadastroVacinaModel {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idVacina;
	
	@NotEmpty(message="Este campo precisa do seu nome!")
	private String nomeDaVacina;
	
	@NotEmpty(message="Este campo precisa do seu email!")
	private String emailUsuario;
	
	@NotNull
    private LocalDate dataAplicacao;

	public Long getIdVacina() {
		return idVacina;
	}

	public void setIdVacina(Long idVacina) {
		this.idVacina = idVacina;
	}

	public String getNomeDaVacina() {
		return nomeDaVacina;
	}

	public void setNomeDaVacina(String nomeDaVacina) {
		this.nomeDaVacina = nomeDaVacina;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public LocalDate getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(LocalDate dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}
	
}
