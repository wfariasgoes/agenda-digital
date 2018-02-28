package com.everis.agendadigital.model;

public enum TipoLogradouro {
	RUA("Rua"),
	LOGRADOURO("Avenida"), 
	TRAVESSA("Travessa"),
	BECO("Beco");
	
	private String tipo;
	
	TipoLogradouro(String tipo){
		this.tipo =  tipo; 
	}

	public String getTipo() {
		return tipo;
	}
}
