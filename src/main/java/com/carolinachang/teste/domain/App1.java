package com.carolinachang.teste.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.carolinachang.teste.enums.TipoProjeto;

@Document
public class App1 {

	@Id
	private String id;
	private TipoProjeto tipoProjeto = TipoProjeto.APP1;
	private ContatoDTO contato;
	
	public App1() {
		
	}
	
	public String getId() {
		return id;
	}

	public App1(String id, TipoProjeto projeto) {
		this.id = id;
		this.tipoProjeto = projeto;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TipoProjeto getTipoProjeto() {
		return tipoProjeto;
	}

	
	public ContatoDTO getContato() {
		return contato;
	}

	public void setContato(ContatoDTO contato) {
		this.contato = contato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		App1 other = (App1) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
