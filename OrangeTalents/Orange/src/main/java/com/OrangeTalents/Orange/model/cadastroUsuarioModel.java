package com.OrangeTalents.Orange.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.br.CPF;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tb_cadastroUsuario")
public class cadastroUsuarioModel {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idUsuario;
	
	@Column
	@NotNull
	@NotEmpty(message="Este campo precisa do seu nome!")
	private String nome;
	
	@Column(unique=true)
	@NotNull
	@NotEmpty(message="Este campo precisa do seu email!")
	@Email
	private String email;
	
	@Column(unique=true)
	@NotNull
	@NotEmpty(message="Este campo precisa do seu CPF!")
	@Size(min = 14, max = 14, message="CPF deve ter 11 numeros")
	@CPF
	private String cpf;

	@Column
	@NotNull
	@NotEmpty(message="Este campo precisa da sua data de nascimento!")
	@JsonFormat(pattern="yyyy-mm-dd")
	private String nascimento;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String Nascimento) {
		this.nascimento = Nascimento;
	}
	
}
