package com.OrangeTalents.Orange.model;

import java.time.LocalDate;

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
	
	@NotEmpty(message="Este campo precisa do seu nome!")
	private String nome;
	
	@NotEmpty(message="Este campo precisa do seu email!")
	@Email
	private String email;
	
	@NotEmpty(message="Este campo precisa do seu CPF!")
	@Size(min = 11, max = 11, message="CPF deve ter 11 numeros")
	@CPF
	private String cpf;

	@NotEmpty(message="Este campo precisa da sua data de nascimento!")
	@JsonFormat(pattern="yyyy-mm-dd")
	private LocalDate nascimento;
	
	

	public cadastroUsuarioModel(@NotEmpty(message = "Este campo precisa do seu nome!") String nome,
		@NotEmpty(message = "Este campo precisa do seu email!") @Email String email,
		@NotEmpty(message = "Este campo precisa do seu CPF!") @Size(min = 11, max = 11, message = "CPF deve ter 11 numeros") @CPF String cpf){
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

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

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate Nascimento) {
		this.nascimento = Nascimento;
	}
	
}
