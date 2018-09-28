package com.carolinachang.teste.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Contato<T> {

	
	@Id
	private String id;
	private Date data;
	private String nome;
	private String email;
	private String telefone;
	private String mensagem;
	private T projeto;
	
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}

	
	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public T getProjeto() {
		return projeto;
	}


	public void setProjeto(T projeto) {
		this.projeto = projeto;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	
}
