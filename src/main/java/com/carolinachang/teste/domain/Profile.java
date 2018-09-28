package com.carolinachang.teste.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.carolinachang.teste.enums.TipoProjeto;

@Document
public class Profile {

	@Id
	private String id;
	private TipoProjeto tipoProjeto = TipoProjeto.PROFILE;
	
	public Profile() {
		// TODO Auto-generated constructor stub
	}
	
	public Profile(String id, TipoProjeto projeto) {
		super();
		this.id = id;
		this.tipoProjeto = projeto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public TipoProjeto getTipoProjeto() {
		return tipoProjeto;
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
		Profile other = (Profile) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
