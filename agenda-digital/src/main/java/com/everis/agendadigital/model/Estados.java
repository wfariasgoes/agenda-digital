package com.everis.agendadigital.model;

public enum Estados {

	RO("RO"),
	AC("AC"),
	AM("AM"),
	PA("PA"),
	MA("MA"),
	CE("CE"),
	RN("RN"),
	PB("PB"),
	PE("PE"),
	AL("AL"),
	SE("SE"),
	BA("BA"),
	MG("MG"),
	ES("ES"),
	RJ("RJ"),
	SP("SP"),
	PR("PR"),
	SC("SC"),
	RS("RS"),
	MS("MS"),
	MT("MT"),
	GO("GO"),
	DF("DF");

	private String estado;

	private Estados(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
 	
	 
}
