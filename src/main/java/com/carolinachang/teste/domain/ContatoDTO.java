package com.carolinachang.teste.domain;

import java.util.Date;

public class ContatoDTO {

	private String id;
	private Date data;
	private String nome;
	private String email;
	private String telefone;
	private String mensagem;
	
	public ContatoDTO() {
		// TODO Auto-generated constructor stub
	}

	public ContatoDTO(Contato<?> contato) {
		super();
		this.id = contato.getId();
		this.data = contato.getData();
		this.nome = contato.getNome();
		this.email = contato.getEmail();
		this.telefone = contato.getTelefone();
		this.mensagem = contato.getMensagem();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
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

}
