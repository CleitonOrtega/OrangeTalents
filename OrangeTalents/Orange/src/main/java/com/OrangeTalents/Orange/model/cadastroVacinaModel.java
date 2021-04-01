package com.OrangeTalents.Orange.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_cadastroVacina")
public class cadastroVacinaModel {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idVacina;
	
	@Column
	@NotNull
	private String nomeDaVacina;
	
	@Column(unique=true)
	@NotNull
	private String emailUsuario;
	
	@Column
	@NotNull
	@JsonFormat(pattern="yyyy-mm-dd")
    private String dataAplicacao;

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
	
}
