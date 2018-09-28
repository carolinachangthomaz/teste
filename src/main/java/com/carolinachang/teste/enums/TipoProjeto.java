package com.carolinachang.teste.enums;


public enum TipoProjeto {

	PROFILE(1,"PROFILE"),
	APP1(2,"APP 1");
	
	private int codigo;
	private String descricao;
	
	private TipoProjeto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoProjeto toEnum(Integer codigo) {
		if(codigo == null) {
			return null;
		}
		
		for (TipoProjeto p : TipoProjeto.values()) {
			if(codigo.equals(p.getCodigo())) {
				return p;
			}
		}
		
		throw new IllegalArgumentException("Código inválido");
	}
}
