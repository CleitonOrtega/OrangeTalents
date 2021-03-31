package com.OrangeTalents.Orange.model;

import java.time.LocalDate;

import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_cadastroVacina")
public class cadastroVacinaModel {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idVacina;
	
	@NotNull
	@NotEmpty(message="Este campo precisa do seu nome!")
	private String nomeDaVacina;
	
	@NotNull
	@NotEmpty(message="Este campo precisa do seu email!")
	private String emailUsuario;
	
	@NotNull
    private String dataAplicacao;

	

	public cadastroVacinaModel(@NotEmpty(message = "Este campo precisa do seu nome!") String nomeDaVacina,
			@NotEmpty(message = "Este campo precisa do seu email!") String emailUsuario,
			@NotNull String dataAplicacao) {
		super();
		this.nomeDaVacina = nomeDaVacina;
		this.emailUsuario = emailUsuario;
		this.dataAplicacao = dataAplicacao;
	}

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

	public String getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(String dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

	public cadastroVacinaModel muda() {
		return new cadastroVacinaModel(this.nomeDaVacina,this.emailUsuario,this.dataAplicacao);
	}
	
}
